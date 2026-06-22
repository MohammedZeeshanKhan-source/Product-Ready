package com.productionready.Production_Ready.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    ModelMapper getmodelmapper() {
        return new ModelMapper();
    }

}
