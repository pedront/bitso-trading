package br.com.pedront.bitsotrading.core.client.api.bitso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class FeignConfiguration {

    /**
     * Defines the log level for FeignClient
     * 
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
