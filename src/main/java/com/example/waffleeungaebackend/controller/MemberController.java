package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.config.login.LoginUser;
import com.example.waffleeungaebackend.dto.MemberDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@AllArgsConstructor
@RestController
public class MemberController {

    @GetMapping("/loginId")
    public ResponseEntity<Long> getName(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getMemberId());
    }


    @GetMapping("/loginEmail")
    public ResponseEntity<String> getEmail(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getEmail());
    }

    @GetMapping("/loginMember")
    public ResponseEntity<MemberDto> getMember(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto);
    }
}
