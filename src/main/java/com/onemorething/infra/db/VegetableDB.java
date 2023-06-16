package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class VegetableDB {

    private Map<Integer, IngredientEntity> vegetableList;

    public VegetableDB() {
        this.vegetableList = new HashMap<>();
        vegetableList.put(1, new IngredientEntity(1, "양상추", 1500));
        vegetableList.put(2, new IngredientEntity(2, "페퍼론치노", 1700));
    }

    public Map<Integer, IngredientEntity> getVegetableList() {return vegetableList};

}
