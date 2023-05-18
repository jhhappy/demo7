package com.example.demo;

import org.junit.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author Ustinain
 * @Time 2023/5/18  11:45
 */
public class JedisTest {
    @Test
    public void testRedis(){
        //1，获取连接
        Jedis jedis=new Jedis("localhost",6379);
        //执行具体的操作
//        jedis.set("username","xiaoming");
//        System.out.println(jedis.get("username"));
//        jedis.del("username");
        jedis.hset("myhash","addr","bj");
        System.out.println(jedis.hget("myhash", "addr"));

        Set<String> keys=jedis.keys("*");
        System.out.println(keys);
        //关闭连接
        jedis.close();

    }
}
