package com.onemorething.domain.repository;

import com.onemorething.ContextConfiguration;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.infra.db.BurgerDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class BurgerRepositoryTest {

    private final BurgerRepository burgerRepository;

    @Autowired
    public BurgerRepositoryTest(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }

    private BurgerEntity burgerEntity;

    @Test
    public void testCreateBurgerRepository() {
        assertNotNull(burgerRepository);
    }

    @BeforeEach     // 각 메소드 실행 전에 동작
    public void setUp() {
        System.out.println("setUp 동작 확인...");

        this.burgerEntity = burgerEntity;
    }

    @DisplayName("재료들로 버거 결과가 나오는지 확인")
    @Test
    public void getResultBurgerTest() {

        String bread = "참깨빵";
        String vegetable = "양상추";
        String patty = "비프";
        String source = "바베큐";

        BurgerEntity burger = burgerRepository.getResult(new BurgerEntity(bread, vegetable, patty, source));

        System.out.println("burger = " + burger.getBurgerName());
        Assertions.assertEquals("바베큐불고기버거", burger.getBurgerName());
    }

}
