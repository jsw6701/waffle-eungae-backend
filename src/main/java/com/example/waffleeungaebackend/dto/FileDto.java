package com.example.waffleeungaebackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FileDto {
    private Long id;
    private String origFileName;
    private String fileName;
    private String filePath;
}
