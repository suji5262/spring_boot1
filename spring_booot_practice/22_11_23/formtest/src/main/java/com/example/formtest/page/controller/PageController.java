package com.example.formtest.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping("/test")
//    public String test() {
//        return "index";
//    } // 제자리로 돌아가게~ index 페이지가 메인페이지였을때

//    @GetMapping("/test")
//    public String test(String name, String age) {
//        System.out.println(name + " : " + age);
//        return "index";
//    } // 변수를 줘서 받기, 컨트롤러가 내용을 받음, post 로 받으면 오류뜸 - 메서드가 맞지 않기 때문에

    @GetMapping("/test")
    public String test(@RequestParam HashMap<String, String> params) {
        System.out.println(params);
        return "index";
    } // map으로 받기, @RequestParam 어노테이션을 써주지 않으면 받을 수 가 없음

    @PostMapping("/test")
    public String post(@RequestParam HashMap<String, String> params) {
        System.out.println(params);
        return "index";
    } // post 방식

}
