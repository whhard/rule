package com.daokoujinke.controller;

import com.daokoujinke.common.bean.ResponseBean;
import com.daokoujinke.common.remoteShell.RemoteShellTool;
import com.daokoujinke.entity.*;
import com.daokoujinke.service.AntifraudIndexService;
import com.daokoujinke.service.LevelCreditService;
import com.daokoujinke.service.OutEtlService;
import com.daokoujinke.service.project.RuleLogService;
import com.daokoujinke.vo.RuleLogVO;
import com.daokoujinke.vo.response.RuleLogResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Api(value = "规则引擎接口",tags = "规则引擎接口")
//@Api(value = "远程重新部署接口",tags = "远程重新部署接口")
@RestController
@CrossOrigin
public class RuleController {
    @Autowired
    private AntifraudIndexService antifraudIndexService;
    @Autowired
    private RuleLogService ruleLogService;
    @Autowired
    private OutEtlService outEtlService;
    @Autowired
    private LevelCreditService levelCreditService;

    @ApiOperation(value = "业务对象匹配规则接口",notes = "业务对象匹配规则接口")
    @RequestMapping(value = "/rule",method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseBean testRule(@RequestParam String data) throws IOException {
        try {
            //获取决策集结果入库
            TAntifraudIndex antifraudIndex = antifraudIndexService.findTAntifraudIndexByName(data);
            OutEtlEnterprise outEtlEnterprise = outEtlService.findByCompanyName(data);
            //获取评分卡结果入库
            outEtlService.insertResultMsg(outEtlEnterprise);
            antifraudIndexService.insertResultMsg(antifraudIndex,outEtlEnterprise);
            //根据评分卡结果、规则统计结果获取对应的等级和放款额度
            TScorecardBase scoreByName = levelCreditService.findScoreByName(data);
            TResultCountBase resultCountByName = levelCreditService.findResultCountByName(data);
            levelCreditService.insertScoreLevel(scoreByName,resultCountByName);
            return new ResponseBean(200,"操作成功","");
        } catch (Exception e) {
            return new ResponseBean(404,"操作失败","");
        }
    }

    @ApiOperation(value = "获取所有规则日志列表",notes = "获取所有规则日志列表")
    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public ResponseBean selectAllRuleLogs(@RequestBody RuleLogVO vo){
        try {
            List<RuleLogResp> ruleLogResps = ruleLogService.showAllLogs(vo);
            return new ResponseBean(200,"操作成功",ruleLogResps);
        } catch (Exception e) {
            return new ResponseBean(404,"操作失败",e.getMessage());
        }
    }

    @ApiOperation(value = "获取所有项目库名称",notes = "获取所有项目库名称")
    @RequestMapping(value = "/projectName",method = RequestMethod.GET)
    public ResponseBean selectAllProjectName(){
        try {
            List<String> list = ruleLogService.showAllProjectName();
            return new ResponseBean(200,"操作成功",list);
        } catch (Exception e) {
            return new ResponseBean(404,"操作失败",e.getMessage());
        }
    }


    /*@ApiOperation(value = "获取项目规则列表",notes = "获取项目规则列表")
    @RequestMapping(value = "/project",method = RequestMethod.GET)
    public ResponseBean selectProjects(){
        try {
            List<Project> projects = projectService.showAllProject();
            return new ResponseBean(200,"操作成功",projects);
        } catch (Exception e) {
            return new ResponseBean(404,"操作失败",e.getMessage());
        }
    }*/


    /*@ApiOperation(value = "启动shell脚本",notes = "启动shell脚本")
    @RequestMapping(value = "/restart",method = RequestMethod.GET)
    public ResponseBean startShell() {
        try {
            RemoteShellTool shellTool = new RemoteShellTool("47.104.249.102", "mengjintao", "mjt@Daokoujinke", "utf-8");
            String result = shellTool.execute("cd tomcat-jintao/;sh my-sh.sh > shell.log");
            return new ResponseBean(200,"操作成功",result);
        } catch (Exception e) {
            return new ResponseBean(400,"操作失败",e.getMessage());
        }
    }*/
}
