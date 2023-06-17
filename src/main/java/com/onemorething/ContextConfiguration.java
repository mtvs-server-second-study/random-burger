package com.onemorething;

import com.onemorething.infra.db.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.onemorething")
public class ContextConfiguration {

    @Bean
    public BreadDB breadDB(){
        return new BreadDB();
    }

    @Bean
    public BurgerDB burgerDB(){
        return new BurgerDB();
    }

    @Bean
    public PattyDB pattyDB(){
        return new PattyDB();
    }

    @Bean
    public SourceDB sourceDB(){
        return new SourceDB();
    }

    @Bean
    public VegetableDB vegetableDB(){
        return new VegetableDB();
    }
}
