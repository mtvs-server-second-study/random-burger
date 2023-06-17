package com.onemorething.domain.service;

import com.onemorething.ContextConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
class BurgerDomainServiceTest {

    @Autowired
    private BurgerDomainService burgerDomainService;

    @BeforeEach
    public void Setup() {
        System.out.println("setUp 동작 확인...");

        this.burgerDomainService = new BurgerDomainService();
    }

    @Test
    public void testCreateBurgerDomainService() {
        assertNotNull(burgerDomainService);
    }

    @DisplayName("난수 자연수 발생기 테스트")
    @Test
    public void testRandomInt() {

        int index = 4;
        int lowerBound = 1;
        int highBound = 5;

        int[] result = burgerDomainService.getRandomInt(index, lowerBound, highBound);

        for (int i=0; i<result.length; i++) {
            System.out.println("result["+i+"] = " + result[i]);
        }

    }

}