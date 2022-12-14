package com.njwb.ssm;

import com.njwb.ssm.pojo.Dept;
import com.njwb.ssm.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class SsmApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set(){
        //System.out.println(redisTemplate);
        redisTemplate.opsForValue().set("springboot","hello");
    }

    @Test
    public void get(){
        //System.out.println(redisTemplate);
        String string = (String) redisTemplate.opsForValue().get("springboot");
        System.out.println(string);
    }

    @Test
    public void modify(){
        //System.out.println(redisTemplate);
        redisTemplate.opsForValue().set("springboot","hello2");
    }

    @Test
    public void del(){
        //System.out.println(redisTemplate);
        redisTemplate.delete("springboot");
    }

    @Test
    public void set2(){
        redisTemplate.opsForValue().set("springboot","hello3",30, TimeUnit.SECONDS);
    }

    @Autowired
    private DeptService deptService;

    @Test
    public void getByNo(){
        Dept dept = deptService.getByNo(9999);
        System.out.println(dept);
    }

    @Test
    public void add(){
        Dept dept = new Dept();
        dept.setDeptno(9999);
        dept.setDname("lll");
        dept.setDloc("nijia");
        deptService.add(dept);
    }
}
