package com.example.website.contact.repository;

import com.example.website.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper cm;

    public int insertSubscribe(HashMap<String, String> params){
        return cm.insertSubscribe(params);
    }

    public int insertContact(HashMap<String, String> params){
        return cm.insertContact(params);
    }


}
