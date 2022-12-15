package com.example.website.contact.service;

import com.example.website.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public int insertSubscribe(HashMap<String, String> params){
        return cr.insertSubscribe(params);
    }

    public int insertContact(HashMap<String, String> params){
        return cr.insertContact(params);
    }
}
