package com.example.ollma.service;

import org.springframework.stereotype.Service;

import com.example.ollma.dto.ResumeAnalysisResponse;

@Service
public class ResumeAnalyzerService {
	
	
	
	

	    private final OllamaService ollamaService;

	    public ResumeAnalyzerService(OllamaService ollamaService) {
	        this.ollamaService = ollamaService;
	    }

	    public ResumeAnalysisResponse analyze(String resumeText) {

	        String prompt = """
	        Analyze this resume and give:
	        1. ATS Score out of 100
	        2. Strengths
	        3. Missing Keywords
	        4. Suggestions

	        Resume:
	        %s
	        """.formatted(resumeText);

	        String response = ollamaService.getAIResponse(prompt);

	        ResumeAnalysisResponse result = new ResumeAnalysisResponse();

	        result.setAtsScore("Check AI Response");
	        result.setStrengths("Check AI Response");
	        result.setMissingKeywords("Check AI Response");
	        result.setSuggestions(response);

	        return result;
	    }
	}


