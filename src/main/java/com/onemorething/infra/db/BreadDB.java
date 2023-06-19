package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BreadDB {

    private Map<Integer, IngredientEntity> breadList;

    /* 설명. 빵 DB */
    public BreadDB() {
        this.breadList = new HashMap<>();

        breadList.put(1, new IngredientEntity(1, "참깨빵"));
        breadList.put(2, new IngredientEntity(2, "꽃빵"));
    }

    /* 설명. 빵 제공 */
    public String getBread(int seq) {return breadList.get(seq).getName();}

    /* 설명. 빵 전체 조회 */
    public Map<Integer, IngredientEntity> getBreadList() {return breadList;}

}
