package com.example.ollma.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.example.ollma.service.ResumeParserService;

@RestController
@RequestMapping("/ai")
public class ResumeController {
	


    @Autowired
    private ResumeParserService service;

    @PostMapping("/upload")
    public String uploadResume(@RequestParam("file") MultipartFile file) {
        return service.parseResume(file);
    }
    
}



