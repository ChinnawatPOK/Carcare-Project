package com.example.api.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "source")
public class PropertyConversion {

    private String imagesFolder;
    private String channelToken;

}
