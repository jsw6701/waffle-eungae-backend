package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.request.FileRequestDto;
import com.example.waffleeungaebackend.entity.uploadFiles;
public interface FileService {

    Long saveFile(FileRequestDto fileRequestDto);

    uploadFiles getFile(Long id);
}
