package com.onemorething.domain.repository;

import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.infra.db.BurgerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BurgerRepository {

    @Autowired
    private BurgerDB burgerDB;

    /* 설명. 답변에 대한 완성 버거 제공 */
    public String getResult(BurgerEntity ent) {
        String result = " ";

        for (BurgerEntity burger : burgerDB.getBurgerList().values()) {
            if (burger.getBread().equals(ent.getBread()) && burger.getVegetable().equals(ent.getVegetable())
                    && burger.getPatty().equals(ent.getPatty()) && burger.getSource().equals(ent.getSource())
            ) {
                result = burger.getBurgerName();
            }
        }

        return result;
    }
}
