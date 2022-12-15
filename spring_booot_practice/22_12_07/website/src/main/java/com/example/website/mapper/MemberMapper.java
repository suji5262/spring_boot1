package com.example.website.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface MemberMapper {

    public int insertMember(HashMap<String, String> param);

    public HashMap<String, Object> loginMember(HashMap<String, String> member);

    public int hadBalance(String email);
    public int moneyBalance(String email);
    public ArrayList<HashMap<String,Object>> havingBalance(String email);


}
