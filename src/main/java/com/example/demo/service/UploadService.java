package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadService {

    public ResponseEntity<Object> uploadFile(MultipartFile multipartFile) throws IOException {
        Path path = Paths.get("/home/uploaded/", multipartFile.getOriginalFilename());
        multipartFile.transferTo(path);
        return ResponseEntity.ok("SUCCESS");
    }
}
