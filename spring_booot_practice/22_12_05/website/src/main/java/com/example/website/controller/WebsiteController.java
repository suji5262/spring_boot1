package com.example.website.controller;

import com.example.website.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class WebsiteController {

    @Autowired
    WebsiteService ls;

    ArrayList<HashMap<String, String>> memberList = new ArrayList<>();

    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String, String> params) {
        memberList.add(params);
        System.out.println(params);
        ls.insertLogin(params);
        return "login";

    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, String> params, HttpSession session) {

        for (HashMap<String, String> mem : memberList) {
            if (params.get("email").equals(mem.get("email")) && params.get("password").equals(mem.get("password"))) {

                session.setAttribute("email", mem.get("email"));
                System.out.println(mem.get("email"));

            }
        }
        return "index";

    }

    @GetMapping("/logout")
    public String logOut(HttpSession session) {

        session.setAttribute("email", null);
        return "index";
    }

    @GetMapping("/point")
    public String point(@RequestParam HashMap<String, String> params, HttpSession session) {

        params.put("email", (String) session.getAttribute("email"));
        ls.payCharger(params);

        return "index";
    }

}
