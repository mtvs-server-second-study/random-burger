package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PattyDB {

    private Map<Integer, IngredientEntity> pattyList;

    /* 설명. 패티 DB */
    public PattyDB() {
        this.pattyList = new HashMap<>();

        pattyList.put(1, new IngredientEntity(1, "비프"));
        pattyList.put(2, new IngredientEntity(2, "귀뚜라미튀김"));

    }

    /* 설명. 패티 제공*/
    public String getPatty(int seq) {return pattyList.get(seq).getName();}

    /* 설명. 패티 전체 조회*/
    public Map<Integer, IngredientEntity> getPattyList() {return pattyList;}
}
