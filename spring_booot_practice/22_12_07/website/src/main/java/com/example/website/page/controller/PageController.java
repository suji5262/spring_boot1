package com.example.website.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/") // 홈
    public String index() {
        return "index";
    }

    @GetMapping("/goSignup") // 가입하기
    public String goSignup() {
        return "signup";
    }

    @GetMapping("/goLogin") // 로그인하기
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goMember") // 회원가입해라
    public String goMember(HttpSession session) {
        if(session.getAttribute("email")==null) {
            return "signup";
        } else {
            return "index";
        }

    }

    @GetMapping("/goPay")
    public String goPay() {
        return "pay";
    } // 충전하기

    @GetMapping("/goMarket")
    public String goMarket() {
        return "market";
    } // 거래하기

    @GetMapping("/goHistory")
    public String goHistory() {
        return "history";
    } // 거래내역


}
