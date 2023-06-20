package com.onemorething.infra.db;

import com.onemorething.domain.entity.BurgerEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BurgerDB {

    private final Map<Integer, BurgerEntity> burgerList;

    public BurgerDB() {
        this.burgerList = new HashMap<>();

        burgerList.put(1, new BurgerEntity("참깨귀뚜라미레전드버거", "참깨빵", "양상추", "귀뚜라미튀김", "바베큐"));
        burgerList.put(2, new BurgerEntity("민초귀뚜라미버거", "참깨빵", "양상추", "귀뚜라미튀김", "민초"));
        burgerList.put(3, new BurgerEntity("바베큐불고기버거","참깨빵", "양상추", "비프", "바베큐"));
        burgerList.put(4, new BurgerEntity("민초불고기버거", "참깨빵", "양상추", "비프", "민초"));
        burgerList.put(5, new BurgerEntity("민초불고기버거","참깨빵", "페퍼론치노", "귀뚜라미튀김", "바베큐"));
        burgerList.put(6, new BurgerEntity("불진호민초귀뚜라미버거", "참깨빵", "페퍼론치노", "귀뚜라미튀김", "민초"));
        burgerList.put(7, new BurgerEntity("레전드불진호버거", "참깨빵", "페퍼론치노", "비프", "바베큐"));
        burgerList.put(8, new BurgerEntity("불진호민초버거", "참깨빵", "페퍼론치노", "비프", "민초"));
        burgerList.put(9, new BurgerEntity("귀뚜라미꽃빵버거", "꽃빵", "양상추", "귀뚜라미튀김", "바베큐"));
        burgerList.put(10, new BurgerEntity("민초에빠진귀뚜라미버거", "꽃빵", "양상추", "귀뚜라미튀김", "민초"));
        burgerList.put(11, new BurgerEntity("꽃빵불고기버거", "꽃빵", "양상추", "비프", "바베큐"));
        burgerList.put(12, new BurgerEntity("꽃빵민초버거", "꽃빵", "양상추", "비프", "민초"));
        burgerList.put(13, new BurgerEntity("불진호귀뚜라미에빠진꽃민초버거", "꽃빵", "페퍼론치노", "귀뚜라미튀김", "바베큐"));
        burgerList.put(14, new BurgerEntity("꽃빵불진호귀뚜라미버거","꽃빵", "페퍼론치노", "귀뚜라미튀김", "바베큐"));
        burgerList.put(15, new BurgerEntity("불진호꽃빵버거", "꽃빵", "페퍼론치노", "비프", "바베큐"));
        burgerList.put(16, new BurgerEntity("불꽃민초버거","꽃빵", "페퍼론치노", "비프", "민초"));

    }

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

    public Map<Integer, BurgerEntity> getBurgerList() {
        return burgerList;
    }

}

