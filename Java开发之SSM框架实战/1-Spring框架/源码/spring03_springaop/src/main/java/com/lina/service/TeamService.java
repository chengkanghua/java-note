package com.lina.service;

import org.springframework.stereotype.Service;

@Service
public class TeamService implements IService{
    @Override
    public void add(int id, String name) {
       // int num=10/0;
        System.out.println("TeamService----add-----");
    }

    @Override
    public boolean update(int num) {
        System.out.println("TeamService----update-----");
        if(num<666){
            return true;
        }
        return false;
    }
}
