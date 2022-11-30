package com.example.login.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignUp")
    public String goSignUp() {
        return "signup";
    } // 회원가입 페이지로 이동

    @GetMapping("goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goMember")
    public String goMember(HttpSession session) {
        if(session.getAttribute("email") == null) { // 로그인 안한경우
            return "signup";
        }else {
            return "index";
        }
    }
}
