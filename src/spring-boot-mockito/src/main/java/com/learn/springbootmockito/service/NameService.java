package com.learn.springbootmockito.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String getUsername(String id) {
        return "Return real username";
    }
}
