package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class ApplicationPropertiesDTO {
    private String name;
    private String dataSourceUrl;
    private String dataSourceUsername;
    private String dataSourcePassword;
    private String dataSourceDriverClassName;
}
