package com.example.ollma.dto;

public class ResumeAnalysisResponse {
	
	    private String atsScore;
	    private String strengths;
	    private String missingKeywords;
	    private String suggestions;

	    public String getAtsScore() {
	        return atsScore;
	    }

	    public void setAtsScore(String atsScore) {
	        this.atsScore = atsScore;
	    }

	    public String getStrengths() {
	        return strengths;
	    }

	    public void setStrengths(String strengths) {
	        this.strengths = strengths;
	    }

	    public String getMissingKeywords() {
	        return missingKeywords;
	    }

	    public void setMissingKeywords(String missingKeywords) {
	        this.missingKeywords = missingKeywords;
	    }

	    public String getSuggestions() {
	        return suggestions;
	    }

	    public void setSuggestions(String suggestions) {
	        this.suggestions = suggestions;
	    }
	}


