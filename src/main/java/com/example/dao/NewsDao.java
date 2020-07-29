package com.example.dao;

import com.example.entity.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsDao {

//    查询所有新闻
    List<News> getAllNews();

//    新增一条新闻
    void insertNews(News news);



}
