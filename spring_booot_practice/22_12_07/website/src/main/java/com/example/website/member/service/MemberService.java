package com.example.website.member.service;

import com.example.website.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int insertMember(HashMap<String, String> parma) {
        return mr.insertMember(parma);
    }

    public HashMap<String, Object> loginMember(HashMap<String, String> member) {
        return mr.loginMember(member);
    }

    public int hadBalance(String email){
        return mr.hadBalance(email);
    }
    public int moneyBalance(String email){
        return mr.moneyBalance(email);
    }

    public ArrayList<HashMap<String,Object>> havingBalance(String email){
        return mr.havingBalance(email);
    }

}
