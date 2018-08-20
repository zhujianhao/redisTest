package com.zjh.redis;

import com.alibaba.fastjson.JSON;
import com.zjh.bean.TestBean;
import com.zjh.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSet(){
        TestBean testBean = new TestBean();
        TestBean testBean1 = new TestBean();

        testBean.setId("1");
        testBean.setName("test");
        testBean.setTestBean(testBean1);
        redisUtil.set(testBean.getId(),JSON.toJSONString(testBean));
    }

    @Test
    public void testGet(){
        String s = redisUtil.get("1");
        TestBean testBean = JSON.parseObject(s,TestBean.class);
        System.out.println(testBean.toString());
    }

    @Test
    public void testremove(){
        redisUtil.remove("1");
    }

}
