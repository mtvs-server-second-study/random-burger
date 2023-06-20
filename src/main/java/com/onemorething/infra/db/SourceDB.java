package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SourceDB {

    private Map<Integer, IngredientEntity> sourceList;

    public SourceDB() {
        this.sourceList = new HashMap<>();

        sourceList.put(1, new IngredientEntity(1, "바베큐"));
        sourceList.put(2, new IngredientEntity(2, "민초"));

    }

    public String getSource(int seq) {return sourceList.get(seq).getName();}

    public Map<Integer, IngredientEntity> getSourceList() {return sourceList;}

}
