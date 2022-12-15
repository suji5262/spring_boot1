package com.example.website.member.repository;

import com.example.website.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mm;

    public int insertMember(HashMap<String, String> member) {
        return mm.insertMember(member);
    }

    public HashMap<String, Object> loginMember(HashMap<String, String> member) {
        return mm.loginMember(member);
    }

    public int hadBalance(String email){
        return mm.hadBalance(email);
    }
    public int moneyBalance(String email){
        return mm.moneyBalance(email);
    }

    public ArrayList<HashMap<String,Object>> havingBalance(String email){
        return mm.havingBalance(email);
    }

}
