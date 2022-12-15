package com.example.website.coin.repository;

import com.example.website.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {

    @Autowired
    CoinMapper cm;

    public int insertBuy(HashMap<String, String> params) {
        return cm.insertBuy(params);
    }

    public ArrayList<HashMap<String, Object>> selectBuy(String email) {
        return cm.selectBuy(email);
    }


}
