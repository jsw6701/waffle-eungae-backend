package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.request.FileRequestDto;
import com.example.waffleeungaebackend.entity.uploadFiles;
import com.example.waffleeungaebackend.repository.FileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService{
    private FileRepository fileRepository;

    @Override
    public Long saveFile(FileRequestDto fileRequestDto) {
        return fileRepository.save(fileRequestDto.toEntity()).getId();
    }

    @Override
    public uploadFiles getFile(Long id) {
        return fileRepository.findById(id).get();
    }
}
