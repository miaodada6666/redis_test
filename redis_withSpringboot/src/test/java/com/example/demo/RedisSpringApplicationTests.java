package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class RedisSpringApplicationTests {
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//
//    @Test
//    void contextLoads() {
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
//    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() throws Exception {

        Student student = new Student();
        student.setName("苗继欣");
        student.setAge(21);

        redisTemplate.opsForValue().set("student_1", student);
        Student student1 = (Student) redisTemplate.opsForValue().get("student_1");

        System.out.println(student1.getName());
    }

}
