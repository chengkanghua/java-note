package com.lina.controller;

import com.lina.service.TeamService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class TeamController {

    @Resource //JDK1.6以上版本可以使用 默认按名称注入，如果名称不可以，则按类型注入
    private TeamService teamService;

    public TeamController() {
        System.out.println("TeamController---默认构造方法");
    }

    public void add(){
        teamService.add();
        System.out.println("TeamController-----add-----");
    }

}
