package com.daokoujinke.service.project;

import com.daokoujinke.common.customEnum.RuleTypeEnum;
import com.daokoujinke.common.exception.CustomException;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.mapper.project.RuleLogMapper;
import com.daokoujinke.vo.RuleLogVO;
import com.daokoujinke.vo.response.RuleLogResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleLogServiceImpl implements RuleLogService {
    @Autowired
    private RuleLogMapper ruleLogMapper;

    @Override
    @DS("datasource1")
    public List<RuleLogResp> showAllLogs(RuleLogVO ruleLogVO) {
        try {
            int begin = (ruleLogVO.getPageNo()-1)*ruleLogVO.getPageSize();
            int rows = ruleLogVO.getPageSize();
            String ruleType = null;
            if (ruleLogVO.getRuleType() != null || ruleLogVO.getRuleType() != ""){
                ruleType = ruleLogVO.getRuleType();
            }
            String startTime = ruleLogVO.getDate() + " 00:00:00";
            String endTime = ruleLogVO.getDate() + " 23:59:59";
            if (ruleLogVO.getDate() == null || ruleLogVO.getDate() == ""){
                startTime = null;
                endTime = null;
            }
            List<RuleLogResp> ruleLogResps = ruleLogMapper.queryAllLog(ruleLogVO.getProjectName(), ruleType, begin, rows, startTime, endTime, ruleLogVO.getRuleName());
            int i = 1;
            for (RuleLogResp ruleLog : ruleLogResps) {
                //转换规则类型
                if (ruleLog.getRuleType() != null){
                    Integer integer = new Integer(ruleLog.getRuleType());
                    ruleLog.setRuleType(RuleTypeEnum.fromIndex(integer));
                }
                //返回给前台的序列号
                ruleLog.setId(i);
                i++;
            }
            return ruleLogResps;
        } catch (Exception e) {
            throw new CustomException("获取规则日志信息失败");
        }
    }

    @Override
    @DS("datasource1")
    public List<String> showAllProjectName() {
        List<String> list = ruleLogMapper.queryAllProjectName();
        return list;
    }
}
