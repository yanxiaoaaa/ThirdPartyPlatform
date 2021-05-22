package com.science.resource.config;

import com.science.resource.StorageService.LocalStorage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@PropertySource("classpath:application.yml")
public class StorageAutoConfiguration {
    @Value("${Local.address}")
    private String address;
    @Value("${Local.storagePath}")
    private String storagePath;

    @Bean
    public LocalStorage localStorage() {
        LocalStorage localStorage = new LocalStorage();
        localStorage.setAddress(address);
        localStorage.setStoragePath(storagePath);
        return localStorage;
    }
}
