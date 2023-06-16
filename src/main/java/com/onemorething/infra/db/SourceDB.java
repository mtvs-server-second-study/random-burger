package com.onemorething.infra.db;

import com.onemorething.domain.entity.IngredientEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SourceDB {

    private Map<Integer, IngredientEntity> sourceList;

    /* 설명. 소스 DB */
    public SourceDB() {
        this.sourceList = new HashMap<>();

        sourceList.put(1, new IngredientEntity(1, "바베큐", 500));
        sourceList.put(2, new IngredientEntity(2, "민초", 800));

    }

    /* 설명. 소스 제공 */
    public String getSource(int seq) {return sourceList.get(seq).getName();}

    /* 설명. 소스 전체 조회 */
    public Map<Integer, IngredientEntity> getSourceList() {return sourceList;}

}
