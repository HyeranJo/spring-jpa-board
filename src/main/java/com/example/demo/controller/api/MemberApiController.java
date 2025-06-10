package com.example.demo.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/member")
public class MemberApiController {
    @RequestMapping("/login")
    public void insertMember() {

    }
}
