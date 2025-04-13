package com.example.demo.service;

import com.example.demo.component.ApplicationProperties;
import com.example.demo.component.DataSourceProperties;
import com.example.demo.dto.ApplicationPropertiesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationProperties applicationProperties;
    private final DataSourceProperties dataSourceProperties;

    public ApplicationPropertiesDTO getApplicationProperties() {
        return ApplicationPropertiesDTO.builder()
                .name(applicationProperties.getName())
                .dataSourceUrl(dataSourceProperties.getUrl())
                .dataSourceUsername(dataSourceProperties.getUsername())
                .dataSourcePassword(dataSourceProperties.getPassword())
                .dataSourceDriverClassName(dataSourceProperties.getDriverClassName())
                .build();
    }
}
