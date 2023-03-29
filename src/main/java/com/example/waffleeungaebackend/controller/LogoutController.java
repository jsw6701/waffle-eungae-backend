package com.example.waffleeungaebackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LogoutController {
    @RequestMapping("/logout")
    public void logout(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://waffle.eung-ae-back.kro.kr/logout");
    }
}
