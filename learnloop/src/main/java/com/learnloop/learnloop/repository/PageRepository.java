package com.learnloop.learnloop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PageRepository {

    public String findPageById(String pageId) {
        // In a real scenario, this would fetch data from a database
        return "Mock data for page: " + pageId;
    }
}
