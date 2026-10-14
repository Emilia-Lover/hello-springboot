package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 브라우저 요청을 받아 응답을 돌려주는 클래스
@RestController
public class HelloController {

    // http://localhost:8080/ 으로 접속하면 이 메서드가 실행됨
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello World~</h1>";
    }
}
