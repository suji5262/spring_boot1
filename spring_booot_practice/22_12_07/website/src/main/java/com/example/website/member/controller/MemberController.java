package com.example.website.member.controller;

import com.example.website.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String insertMember(@RequestParam HashMap<String, String> params) {
        RequestParamMethodArgumentResolver r;
        ms.insertMember(params);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginMember(@RequestParam HashMap<String, String> params, HttpSession session) {
        HashMap<String, Object> verified = ms.loginMember(params);
        if (verified != null) {
            String email = String.valueOf(verified.get("email"));
            session.setAttribute("email", email);
        }
        return "redirect:/";
    }

    @GetMapping("/hadBalance")
    public @ResponseBody int hadBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.hadBalance(email);
        }
        return 0;
    }

    @GetMapping("/havingBalance")
    public @ResponseBody ArrayList<HashMap<String, Object>> havingBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.havingBalance(email);
        }
        return null;
    }

    @GetMapping("/moneyBalance")
    public @ResponseBody int moneyBalance(HttpSession session){
        if(session.getAttribute("email")!=null){
            String email = String.valueOf(session.getAttribute("email"));
            return ms.moneyBalance(email);
        }
        return 0;
    }

}
