package com.onemorething.domain.repository;

import com.onemorething.Application;
import com.onemorething.ContextConfiguration;
import com.onemorething.infra.db.BreadDB;
import com.onemorething.infra.db.PattyDB;
import com.onemorething.infra.db.SourceDB;
import com.onemorething.infra.db.VegetableDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class IngredientRepository {

    BreadDB breadDB = new BreadDB();

    VegetableDB vegetableDB = new VegetableDB();

    PattyDB pattyDB = new PattyDB();

    SourceDB sourceDB = new SourceDB();

//    ApplicationContext context =
//            new AnnotationConfigApplicationContext(ContextConfiguration.class);

//    BreadDB breadDB = context.getBean("breadDB", BreadDB.class);
//    VegetableDB vegetableDB = context.getBean("vegetableDB", VegetableDB.class);
//    PattyDB pattyDB = context.getBean("pattyDB", PattyDB.class);
//    SourceDB sourceDB = context.getBean("sourceDB", SourceDB.class);

    /* 설명. 빵 선택*/
    public String getBread(int seq) {return breadDB.getBreadList().get(seq).getName();}

    public String getVegetable(int seq) { return vegetableDB.getVegetableList().get(seq).getName(); }

    public String getPatty(int seq) { return pattyDB.getPattyList().get(seq).getName(); }

    public String getSource(int seq) { return sourceDB.getSourceList().get(seq).getName(); }


}
