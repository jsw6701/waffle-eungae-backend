package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.config.login.LoginUser;
import com.example.waffleeungaebackend.dto.MemberDto;
import com.example.waffleeungaebackend.service.HeartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("post/{post_id}/like")
public class HeartController {

    private final HeartService heartService;

    @PostMapping
    public ResponseEntity<?> like(@PathVariable Long post_id, @LoginUser MemberDto member) {
        heartService.like(post_id, member.getMemberId());
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> unLike(@PathVariable Long post_id, @LoginUser MemberDto member) {
        heartService.unlike(post_id, member.getMemberId());
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }

}
