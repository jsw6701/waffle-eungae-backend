package com.example.waffleeungaebackend.config.login;

import com.example.waffleeungaebackend.dto.MemberDto;
import com.example.waffleeungaebackend.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

@RequiredArgsConstructor
@Controller
@Slf4j
public class LoginController {
    private final PostService postService;

    @GetMapping("/logintest")
    public String index(Model model, @ApiIgnore @LoginUser MemberDto user){
        // model.addAttribute("post", postService.findAllDesc());

        if(user != null){
            model.addAttribute("username", user.getName());
        }
        return "redirect : https://waffle-eungae-frontend.vercel.app";
    }
}