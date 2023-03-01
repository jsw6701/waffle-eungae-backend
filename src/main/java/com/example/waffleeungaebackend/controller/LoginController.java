package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.dto.SessionMember;
import com.example.waffleeungaebackend.service.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final PostServiceImpl postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionMember member) {
        if (member != null) {
            model.addAttribute("userName", member.getName());
        }
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


}