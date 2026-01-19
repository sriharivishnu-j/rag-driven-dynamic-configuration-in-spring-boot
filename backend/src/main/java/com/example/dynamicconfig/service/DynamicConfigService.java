package com.example.dynamicconfig.service;

import org.springframework.stereotype.Service;

@Service
public class DynamicConfigService {

    public String getDynamicConfig() {
        // Imagine this method interacts with a remote system to fetch configurations
        return "{\"key\": \"value\"}";
    }
}
