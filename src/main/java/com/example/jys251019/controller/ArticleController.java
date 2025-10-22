package com.example.jys251019.controller;
import com.example.jys251019.dto.ArticleForm;
import com.example.jys251019.entity.Article;
import com.example.jys251019.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        // 1. dto를 엔티티로 변환
        Article article= form.toEntity();
        System.out.println(article.toString());

        // 2. 리파지터리로 엔티티를 디비에 저장
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }

}
