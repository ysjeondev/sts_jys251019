package com.example.jys251019.repository;

import com.example.jys251019.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // 별도 메서드 선언 필요 없음
}
