package com.example.website.point.service;

import com.example.website.point.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PointService {

    @Autowired
    PointRepository pr;

    public int insertPoint(HashMap<String,String> point){
        return pr.insertPoint(point);
    }
    public double checkBalance(String email){return pr.checkBalance(email);};
    public ArrayList<HashMap<String,Object>> selectPoint(String email){
        return pr.selectPoint(email);
    }


}
