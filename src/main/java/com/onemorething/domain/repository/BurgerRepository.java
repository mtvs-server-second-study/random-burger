package com.onemorething.domain.repository;

import com.onemorething.ContextConfiguration;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.infra.db.BurgerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;


@Repository
public class BurgerRepository {

    @Autowired
    BurgerDB burger;

    ApplicationContext context =
            new AnnotationConfigApplicationContext(ContextConfiguration.class);
    BurgerDB burgerDB = context.getBean("burgerDB", BurgerDB.class);

    public String getResult(BurgerEntity ent) {
        String result = " ";

        for (BurgerEntity burger : burgerDB.getBurgerList().values()) {
            if (burger.getBread().equals(ent.getBread()) || burger.getVegetable().equals(ent.getVegetable())
                    || burger.getPatty().equals(ent.getPatty()) || burger.getSource().equals(ent.getSource())
            ) { result = String.valueOf(burgerDB.getBurgerList().get(burger)); }
        }

        return result;
    }
}
