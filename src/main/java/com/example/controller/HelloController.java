package com.example.controller;

import com.example.entity.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;



@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/getInfo")
    public List getInfo(){
        List<String> user = new ArrayList<String>();
        user.add("1");
        user.add("2");
        user.add("3");

        return user;
    }

    @PostMapping("/getNews")
    public HashSet getNews(){

        HashSet news = new HashSet<>();

        Student s1 = new Student();
        s1.setName("xiaolongnv");
        s1.setAge("21");

        Student s2 = new Student();
        s2.setName("renYY");
        s2.setAge("22");

        Student s3 = new Student();
        s3.setName("zhouZr");
        s3.setAge("23");

        news.add(s1);
        news.add(s2);
        news.add(s3);


        return news;

    }


}
