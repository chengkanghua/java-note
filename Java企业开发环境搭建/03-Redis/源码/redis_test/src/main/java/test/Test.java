package test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Test {

    public static void main(String[] args) {
/*
        Jedis jedis = new Jedis("192.168.36.134",6379);
        //存值
        jedis.set("myredis0001","wanglaowu");
        String myredis0001 = jedis.get("myredis0001");
        System.out.println(myredis0001);*/

        //连接池
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(40);
        jedisPoolConfig.setMaxIdle(20);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.36.134", 6379);
        Jedis resource = jedisPool.getResource();
        String set = resource.set("nameaa", "liuneng");
        String nameaa = resource.get("nameaa");
        System.out.println(nameaa);

    }
}
