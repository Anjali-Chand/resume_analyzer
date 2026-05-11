package com.example.ollma.service;

import java.io.InputStream;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ResumeParserService {
    
    
    
        public String parseResume(MultipartFile file) {

            try (InputStream input = file.getInputStream()){
            		PDDocument document = Loader.loadPDF(file.getBytes());
            		

                PDFTextStripper stripper = new PDFTextStripper();
                return stripper.getText(document);

            } catch (Exception e) {
                return "Error reading PDF: " + e.getMessage();
            }
        }
    }
