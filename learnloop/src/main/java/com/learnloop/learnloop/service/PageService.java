package com.learnloop.learnloop.service;

import org.springframework.stereotype.Service;

@Service
public class PageService {

    public String getPageContent(String page) {
        switch (page) {
            case "page1":
                return "This is the content for Page 1.";
            case "page2":
                return "This is the content for Page 2.";
            case "page3":
                return "This is the content for Page 3.";
            default:
                return "Welcome to the Learnloop Home Page!";
        }
    }
}
