package com.onemorething.domain.repository;

import com.onemorething.infra.db.BreadDB;
import com.onemorething.infra.db.PattyDB;
import com.onemorething.infra.db.SourceDB;
import com.onemorething.infra.db.VegetableDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class IngredientRepository {

    public final BreadDB breadDB;
    public final VegetableDB vegetableDB;
    public final PattyDB pattyDB;
    public final SourceDB sourceDB;

    @Autowired
    public IngredientRepository(BreadDB breadDB, VegetableDB vegetableDB, PattyDB pattyDB, SourceDB sourceDB) {
        this.breadDB = breadDB;
        this.vegetableDB = vegetableDB;
        this.pattyDB = pattyDB;
        this.sourceDB = sourceDB;
    }


    /* 설명. 빵 선택*/
    public String getBread(int seq) {return breadDB.getBreadList().get(seq).getName();}

    public String getVegetable(int seq) { return vegetableDB.getVegetableList().get(seq).getName(); }

    public String getPatty(int seq) { return pattyDB.getPattyList().get(seq).getName(); }

    public String getSource(int seq) { return sourceDB.getSourceList().get(seq).getName(); }


}
