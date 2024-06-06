package com.lina.service;

import org.springframework.stereotype.Service;

@Service("nbaService")
public class NBAService implements IService{
    @Override
    public void add(int id, String name) {
        System.out.println("NBAService----add-----");
    }

    @Override
    public boolean update(int num) {
        System.out.println("NBAService----update-----");
        if(num>666){
            return true;
        }
        return false;
    }
}
