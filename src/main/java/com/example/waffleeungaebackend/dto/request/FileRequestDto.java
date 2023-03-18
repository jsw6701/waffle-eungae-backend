package com.example.waffleeungaebackend.dto.request;


import lombok.*;

import com.example.waffleeungaebackend.entity.uploadFiles;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileRequestDto {
    private Long id;
    private String origFilename;
    private String filename;
    private String filePath;

    public uploadFiles toEntity() {
        return uploadFiles.builder()
                .id(id)
                .origFilename(origFilename)
                .fileName(filename)
                .filePath(filePath)
                .build();
    }

    @Builder
    public FileRequestDto(Long id, String origFilename, String filename, String filePath) {
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
