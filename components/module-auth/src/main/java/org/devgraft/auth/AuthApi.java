package org.devgraft.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("social/login")
@RestController
public class AuthApi {
    // 토큰 갱신
    @GetMapping
    public void login() {

    }
}
