package com.example.website.repository;

import com.example.website.mapper.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class WebsiteRepository {

    @Autowired
    WebsiteMapper webb;

    public int insertLogin(HashMap<String, String> param) {
        return webb.insertLogin(param);
    }

    public int payCharger(HashMap<String, String> param) {
        return webb.payCharger(param);
    }
}
