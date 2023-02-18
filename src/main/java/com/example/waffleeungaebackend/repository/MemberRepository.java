package com.example.waffleeungaebackend.repository;

import com.example.waffleeungaebackend.entity.Member;
import com.example.waffleeungaebackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
        Optional<Object> findByUserEmail(String useremail);
}
