package com.lina.staticproxy;

import com.lina.service.TeamService;

/**
 * 基于类的静态代理类：经纪人
 *      要求代理类必须继承被代理类
 *      弊端：代理类只能代理一个类
 */
public class ProxyTeamService extends TeamService {

    @Override
    public void add() {
        try {
            System.out.println("开始事务");
            super.add();//核心业务--被代理类做
            System.out.println("提交事务");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }

    public static void main(String[] args) {
        TeamService teamService=new ProxyTeamService();
        teamService.add();
    }
}
