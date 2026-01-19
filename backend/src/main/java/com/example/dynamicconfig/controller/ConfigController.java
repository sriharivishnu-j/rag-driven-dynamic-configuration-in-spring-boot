package com.example.dynamicconfig.controller;

import com.example.dynamicconfig.service.DynamicConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final DynamicConfigService configService;

    @Autowired
    public ConfigController(DynamicConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/api/config")
    public String getConfig() {
        return configService.getDynamicConfig();
    }
}
