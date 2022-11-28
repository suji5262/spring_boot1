package com.example.ex1.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
// controller 주로 MVC에서 사용되나 데이터만 보내기도 함
// URL을 연결시키기기
