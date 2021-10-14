package com.zackCoding.department.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseProperties {

    private String driverclassname;
    private String url;
    private String username;
    private String  password;


}
