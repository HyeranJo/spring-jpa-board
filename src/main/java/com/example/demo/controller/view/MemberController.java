package com.example.demo.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/member")
public class MemberController {
    @RequestMapping("/login")
    public String getLogin() {
        return "member/login";
    }
}
