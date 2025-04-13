package com.example.demo.controller;

import com.example.demo.dto.ApplicationPropertiesDTO;
import com.example.demo.service.ApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "애플리케이션")
@RestController
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @GetMapping("")
    @Operation(summary = "애플리케이션 설정 조회")
    public ApplicationPropertiesDTO getApplicationProperties() {
        return applicationService.getApplicationProperties();
    }
}
