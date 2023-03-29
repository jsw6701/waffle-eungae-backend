package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.config.login.LoginUser;
import com.example.waffleeungaebackend.dto.MemberDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
public class MemberController {

    @GetMapping("/loginId")
    public ResponseEntity<Long> getName(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getMemberId());
    }


    @GetMapping("/loginEmail")
    public ResponseEntity<String> getLoginEmail(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getEmail());
    }

    @GetMapping("loginLevel")
    public ResponseEntity<Long> getLoginLevel(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getLevel());
    }

    @GetMapping("loginName")
    public ResponseEntity<String> getLoginName(@ApiIgnore @LoginUser MemberDto memberDto){
        return ResponseEntity.ok(memberDto.getName());
    }

    @GetMapping("list")
    public ResponseEntity<List> getLoginMember(@ApiIgnore @LoginUser MemberDto memberDto){
        List<Object> list = new ArrayList<>();
        list.add(memberDto.getMemberId());
        list.add(memberDto.getEmail());
        list.add(memberDto.getName());
        list.add(memberDto.getLevel());
        return ResponseEntity.ok(list);
    }

}
