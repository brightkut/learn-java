package com.learn.springbootmockito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private NameService nameService;


    public String getUserName(String id) {
        return nameService.getUsername(id);
    }
}
