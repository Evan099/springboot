package com.example.controller;

import com.example.entity.News;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/getAllNews")
    public List<News> getAllNews(){
        List<News> list = newsService.getAllNews();
        return list;
    }

    @PostMapping("/insertNews")
    public void insertNews(News news){

         newsService.insertNews(news);

    }








}
