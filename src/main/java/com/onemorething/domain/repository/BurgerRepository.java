package com.onemorething.domain.repository;

import com.onemorething.ContextConfiguration;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.infra.db.BurgerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public class BurgerRepository {

    @Autowired
    BurgerDB burger;

    ApplicationContext context =
            new AnnotationConfigApplicationContext(ContextConfiguration.class);
    BurgerDB burgerDB = context.getBean("burgerDB", BurgerDB.class);

//    public Collection<BurgerEntity> getBurgerMenu() {
//
//
////        return burger.getBurgerList();
//    }
}
