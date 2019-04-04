package com.daokoujinke.service.project;

import com.daokoujinke.vo.RuleLogVO;
import com.daokoujinke.vo.response.RuleLogResp;

import java.util.List;

public interface RuleLogService {
    public List<RuleLogResp> showAllLogs(RuleLogVO ruleLogVO);

    public List<String> showAllProjectName();
}
