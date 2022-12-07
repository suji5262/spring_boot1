package com.example.website.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface WebsiteMapper {
    public int insertLogin(HashMap<String, String> param);

    public int payCharger(HashMap<String, String> param);

}
