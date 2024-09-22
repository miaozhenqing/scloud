package com.zq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    @Value("${version:default}")
    private String version;

    public String getVersion() {
        return version;
    }
}
