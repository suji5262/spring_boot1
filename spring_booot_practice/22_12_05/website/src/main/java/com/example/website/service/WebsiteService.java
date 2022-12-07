package com.example.website.service;

import com.example.website.mapper.WebsiteMapper;
import com.example.website.repository.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class WebsiteService {

    @Autowired
    WebsiteRepository web;

    public int insertLogin(HashMap<String, String> parma) {
        return web.insertLogin(parma);
    }

    public int payCharger(HashMap<String, String> parma) {
        return web.payCharger(parma);
    }

}
