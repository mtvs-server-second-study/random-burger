package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PattyDB {

    private Map<Integer, IngredientEntity> pattyList;

    public PattyDB() {
        this.pattyList = new HashMap<>();

        pattyList.put(1, new IngredientEntity(1, "비프", 3500));
        pattyList.put(2, new IngredientEntity(2, "귀뚜라미튀김", 3000));

    }

    public Map<Integer, IngredientEntity> getPattyList() {return pattyList};
}
