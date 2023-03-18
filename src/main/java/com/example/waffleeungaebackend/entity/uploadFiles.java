package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class uploadFiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String origFilename;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String filePath;

    @Builder
    public uploadFiles(Long id, String origFilename, String fileName, String filePath) {
        this.id = id;
        this.origFilename = origFilename;
        this.fileName = fileName;
        this.filePath = filePath;
    }
}