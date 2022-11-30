package com.example.login.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller // 페이지를 이동하면서 다닐꺼기 때문에
public class MemberController {

    ArrayList<HashMap<String, String>> memberList = new ArrayList<>();
            // 데이터베으스에 넣고, 가져오는 일을 ArrayList 가 하게 한것

    @PostMapping("/signup") // html 에서 post 방식으로 받기로 해서
    public String signup(@RequestParam HashMap<String, String> params) { // 파라미터 받기
        System.out.println(params);
        return "index";
    } // map 으로 받아서 전체출력, 모든 값을 서버에 저장

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, String> params, HttpSession session) {
        memberList.add(params);

        params.get("email");
        params.get("password");
        // 파라미터로 멤버의 값이 들어옴
        // 서버로 이메일, 패스워드를 보냄

        for (HashMap<String, String> mem : memberList) {
            if (params.get("email").equals(mem.get("email"))&&params.get("password").equals(mem.get("password"))) {
                // 가입된 회원인 경우, 등록된 이메일과 같은경우
                session.setAttribute("email", mem.get("email"));
                System.out.println(mem.get("email"));
            }
        } //콘솔에 등록한 값이 뜨면 서버에 등록이 된 것

        return "index";
    }


}
