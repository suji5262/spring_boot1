package com.example.website.point.repository;

import com.example.website.mapper.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class PointRepository {

    @Autowired
    PointMapper pm;

    public int insertPoint(HashMap<String,String> point){
        return pm.insertPoint(point);
    }
    public double checkBalance(String email){return pm.checkBalance(email);}

    public ArrayList<HashMap<String,Object>> selectPoint(String email){
        return pm.selectPoint(email);
    }

}
