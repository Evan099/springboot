package com.example.service;

import com.example.entity.News;
import com.example.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    NewsDao newsDao;

//    查询所有新闻
    public List<News> getAllNews(){
     return newsDao.getAllNews();
    }

//    新增一条新闻

    public void insertNews(News news){
         newsDao.insertNews(news);
    }




}
