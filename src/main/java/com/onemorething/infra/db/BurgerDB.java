package com.onemorething.infra.db;

import com.onemorething.domain.entity.BurgerEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BurgerDB {

    private Map<Integer, BurgerEntity> burgerList;

    public BurgerDB() {
        this.burgerList = new HashMap<>();

        burgerList.put(1, new BurgerEntity(1,"참깨귀뚜라미레전드버거", "참깨빵", "양상추", "귀뚜라미튀김", "바베큐", 7000));
        burgerList.put(2, new BurgerEntity(2, "민초귀뚜라미버거", "참깨빵", "양상추", "귀뚜라미튀김", "민초", 7300));
        burgerList.put(3, new BurgerEntity(3, "바베큐불고기버거","참깨빵", "양상추", "비프", "바베큐", 7500));
        burgerList.put(4, new BurgerEntity(4, "민초불고기버거", "참깨빵", "양상추", "비프", "민초", 7800));
        burgerList.put(5, new BurgerEntity(5, "민초불고기버거","참깨빵", "페퍼론치노", "귀뚜라미튀김", "바베큐", 7200));
        burgerList.put(6, new BurgerEntity(6, "불진호민초귀뚜라미버거", "참깨빵", "페퍼론치노", "귀뚜라미튀김", "민초", 7500));
        burgerList.put(7, new BurgerEntity(7, "레전드불진호버거", "참깨빵", "페퍼론치노", "비프", "바베큐", 7700));
        burgerList.put(8, new BurgerEntity(8, "불진호민초버거", "참깨빵", "페퍼론치노", "비프", "민초", 8000));
        burgerList.put(9, new BurgerEntity(9, "귀뚜라미꽃빵버거", "꽃빵", "양상추", "귀뚜라미튀김", "바베큐", 7000));
        burgerList.put(10, new BurgerEntity(10, "민초에빠진귀뚜라미버거", "꽃빵", "양상추", "귀뚜라미튀김", "민초", 7300));
        burgerList.put(11, new BurgerEntity(11, "꽃빵불고기버거", "꽃빵", "양상추", "비프", "바베큐", 7500));
        burgerList.put(12, new BurgerEntity(12, "꽃빵민초버거", "꽃빵", "양상추", "비프", "민초", 7800));
        burgerList.put(13, new BurgerEntity(13,"불진호귀뚜라미에빠진꽃민초버거", "꽃빵", "페퍼론치노", "귀뚜라미튀김", "바베큐", 8000));
        burgerList.put(14, new BurgerEntity(14, "꽃빵불진호귀뚜라미버거","꽃빵", "페퍼론치노", "귀뚜라미튀김", "바베큐", 7200));
        burgerList.put(15, new BurgerEntity(15, "불진호꽃빵버거", "꽃빵", "페퍼론치노", "비프", "바베큐", 7700));
        burgerList.put(16, new BurgerEntity(16, "불꽃민초버거","꽃빵", "페퍼론치노", "비프", "민초", 8000));

    }

    /* 설명. 답변에 대한 완성 버거 제공 */
    public String getResult(BurgerEntity ent) {
        String result = " ";

        for (BurgerEntity burger : getBurgerList().values()) {
            if (burger.getBread().equals(ent.getBread()) && burger.getVegetable().equals(ent.getVegetable())
                    && burger.getPatty().equals(ent.getPatty()) && burger.getSource().equals(ent.getSource())
            ) {
                result = burger.getBurgerName();
            }
        }

        return result;
    }

    /* 설명. 버거 메뉴 전체 조회 */
    public Map<Integer, BurgerEntity> getBurgerList() {
        return burgerList;
    }

}

