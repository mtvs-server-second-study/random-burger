package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class VegetableDB {

    private Map<Integer, IngredientEntity> vegetableList;

    /* 설명. 야채 DB */
    public VegetableDB() {
        this.vegetableList = new HashMap<>();
        vegetableList.put(1, new IngredientEntity(1, "양상추"));
        vegetableList.put(2, new IngredientEntity(2, "페퍼론치노"));
    }

    /* 설명. 랜덤 야채 제공*/
    public String getVegetable(int seq) {return vegetableList.get(seq).getName();}

    /* 설명. 야채 전체 조회 */
    public Map<Integer, IngredientEntity> getVegetableList() {return vegetableList;}

}
