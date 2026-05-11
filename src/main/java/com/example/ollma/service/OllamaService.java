package com.example.ollma.service;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OllamaService {


    private final WebClient webClient = WebClient.create("http://localhost:11434");

    public String getAIResponse(String prompt) {

        
            Map<String, Object> request = Map.of(
                    "model", "phi",
                    "prompt", prompt,
                    "stream", false
            );

            return webClient.post()
                    .uri("/api/generate")
                    .contentType(MediaType.APPLICATION_JSON)
                    .bodyValue(request)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        }
        
    }



