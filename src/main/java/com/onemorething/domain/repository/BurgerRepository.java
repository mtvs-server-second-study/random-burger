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

//    @Autowired
//    private BurgerDB burgerDB;
    ApplicationContext context =
            new AnnotationConfigApplicationContext(ContextConfiguration.class);
    BurgerDB burgerDB = context.getBean("burgerDB", BurgerDB.class);

    public Collection<BurgerEntity> getBurgerMenu() {

        return burgerDB.burgerList.values();
    }
}
/*
# MAP<Integer, Burger> menu //
참깨빵 - 양상추 - 귀뚜라미튀김 - 바베큐 = 참깨귀뚜라미레전드버거
참깨빵 - 양상추 - 귀뚜라미튀김 - 민초 = 민초귀뚜라미버거
참깨빵 - 양상추 - 비프 - 바베큐 = 바베큐불고기버거
참깨빵 - 양상추 - 비프 - 민초 = 민초불고기버거
참깨빵 - 페페론치노 - 귀뚜라미튀김 - 바베큐 = 불지옥귀뚜라미버거
참깨빵 - 페페론치노 - 귀뚜라미튀김 - 민초 = 불지옥민초귀뚜라미버거
참깨빵 - 페페론치노 - 비프 - 바베큐 = 레전드불진호버거
참깨빵 - 페페론치노 - 비프 - 민초 = 불지옥민초버거
꽃빵 - 양상추 - 귀뚜라미튀김 - 바베큐 = 귀뚜라미꽃빵버거
꽃빵 - 양상추 - 귀뚜라미튀김 - 민초 = 민초에빠진귀뚜라미버거
꽃빵 - 양상추 - 비프 - 바베큐 = 꽃빵불고기버거
꽃빵 - 양상추 - 비프 - 민초 = 꽃빵민초버거
꽃빵 - 페페론치노 - 귀뚜라미튀김 - 바베큐 = 꽃빵불지옥귀뚜라미버거
꽃빵 - 페페론치노 - 귀뚜라미튀김 - 민초 = 불지옥귀뚜라미에빠진꽃민초버거
꽃빵 - 페페론치노 - 비프 - 바베큐 = 불지옥꽃빵버거
꽃빵 - 페페론치노 - 비프 - 민초 = 불지옥민초버거
 */