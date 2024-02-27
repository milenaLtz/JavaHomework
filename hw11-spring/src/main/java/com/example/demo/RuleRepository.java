package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RuleRepository extends JpaRepository<Rule, Long> {
    Rule findByShortLink(String shortLink);
}
