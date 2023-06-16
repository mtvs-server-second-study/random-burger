package com.onemorething.infra.db;

import com.onemorething.domain.entity.BurgerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Component
public class BurgerDB {

    private Map<String, BurgerEntity> burgerList;

    public BurgerDB() {
        this.burgerList = new HashMap<>();

        burgerList.put("참깨귀뚜라미레전드버거", new BurgerEntity(1, "참깨빵", "양상추", "귀뚜라미튀김", "바베큐", 7000));
        burgerList.put("민초귀뚜라미버거", new BurgerEntity(2, "참깨빵", "양상추", "귀뚜라미튀김", "민초", 7300));
        burgerList.put("바베큐불고기버거", new BurgerEntity(3, "참깨빵", "양상추", "비프", "바베큐", 7500));
        burgerList.put("민초불고기버거", new BurgerEntity(4, "참깨빵", "양상추", "비프", "민초", 7800));
        burgerList.put("불진호귀뚜라미버거", new BurgerEntity(5, "참깨빵", "페페론치노", "귀뚜라미튀김", "바베큐", 7200));
        burgerList.put("불진호민초귀뚜라미버거", new BurgerEntity(6, "참깨빵", "페페론치노", "귀뚜라미튀김", "민초", 7500));
        burgerList.put("레전드불진호버거", new BurgerEntity(7, "참깨빵", "페페론치노", "비프", "바베큐", 7700));
        burgerList.put("불진호민초버거", new BurgerEntity(8, "참깨빵", "페페론치노", "비프", "민초", 8000));
        burgerList.put("귀뚜라미꽃빵버거", new BurgerEntity(9, "꽃빵", "양상추", "귀뚜라미튀김", "바베큐", 7000));
        burgerList.put("민초에빠진귀뚜라미버거", new BurgerEntity(10, "꽃빵", "양상추", "귀뚜라미튀김", "민초", 7300));
        burgerList.put("꽃빵불고기버거", new BurgerEntity(11, "꽃빵", "양상추", "비프", "바베큐", 7500));
        burgerList.put("꽃빵민초버거", new BurgerEntity(12, "꽃빵", "양상추", "비프", "민초", 7800));
        burgerList.put("불진호귀뚜라미에빠진꽃민초버거", new BurgerEntity(13, "꽃빵", "페페론치노", "귀뚜라미튀김", "바베큐", 8000));
        burgerList.put("꽃빵불진호귀뚜라미버거", new BurgerEntity(14, "꽃빵", "페페론치노", "귀뚜라미튀김", "바베큐", 7200));
        burgerList.put("불진호꽃빵버거", new BurgerEntity(15, "꽃빵", "페페론치노", "비프", "바베큐", 7700));
        burgerList.put("불꽃민초버거", new BurgerEntity(16, "꽃빵", "페페론치노", "비프", "민초", 8000));

    }

    public Map<String, BurgerEntity> getBurgerList() {
        return burgerList;
    }
}

