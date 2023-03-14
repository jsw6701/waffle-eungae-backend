package com.example.waffleeungaebackend.config.login;

import com.example.waffleeungaebackend.dto.MemberDto;
import com.example.waffleeungaebackend.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
@Slf4j
public class LoginController {

    private final PostService postsService;

    @GetMapping("/testlogin")
    public String index(Model model, @LoginUser MemberDto member) {
        model.addAttribute("posts", postsService.findAllDesc());
        if (member != null) {
            model.addAttribute("userName", member.getName());
        }
        return "test";
    }


}