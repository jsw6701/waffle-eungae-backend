package com.example.waffleeungaebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.waffleeungaebackend.entity.uploadFiles;

public interface FileRepository extends JpaRepository<uploadFiles, Long> {
}
