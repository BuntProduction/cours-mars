package com.doranco.demo.model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.nntp.Article;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private List<Article> articles;

    public ArticleService() {
        articles = new ArrayList<>();
        articles.add(new Article(1, "titre1", "contentblablaba", new User("Bob", "Bobby", "bob@bobby.com")));
    }

    public void addArticle(Article article) {
    }

    public List<Article> getArticles() {
        return this.articles;
    }

    public Article getArticle(int id) {
    }

    public void deleteArticle(int id) {
    }

}
