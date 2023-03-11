package com.example.waffleeungaebackend.config.login;

import com.example.waffleeungaebackend.dto.MemberDto;
import com.example.waffleeungaebackend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final PostService postsService;

    @GetMapping("/login")
    public String index(Model model, @LoginUser MemberDto member) {
        Pageable Pageable;
        model.addAttribute("posts", postsService.findAllDesc());
        if (member != null) {
            model.addAttribute("userName", member.getName());
        }
        return "index";
    }


}