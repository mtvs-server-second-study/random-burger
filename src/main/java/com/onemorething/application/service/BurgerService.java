package com.onemorething.application.service;

import com.onemorething.common.BurgerDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.entity.IngredientEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.infra.db.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class BurgerService {

    IngredientEntity ingredientEntity = new IngredientEntity();
    BreadDB breadDB = new BreadDB();
    VegetableDB vegetableDB = new VegetableDB();
    PattyDB pattyDB = new PattyDB();
    SourceDB sourceDB = new SourceDB();
    BurgerDTO burgerDTO = new BurgerDTO();
    BurgerEntity burgerEntity = new BurgerEntity();
    BurgerRepository burgerRepository = new BurgerRepository();
//
//    BurgerDB burgerDB = new BurgerDB();
    public String makeBurger(BurgerDTO result) {

        int[] randomSequence = new int[4];
        for (int i=0; i<randomSequence.length; i++){
            randomSequence[i] = (int)(Math.random() +2);   // 설명. 1과 2만 나오는 난수 발생기
        }

        burgerDTO.setAnswerBread(breadDB.getBread(randomSequence[0])); // 필기. 사용자 답
        if (randomSequence[0] == 1) {
            burgerDTO.setAnotherAnsBread(breadDB.getBread(2));  //  필기. 사용자가 선택하지 않은 답( 추후에 결과 공개를 위해 )
        } else if (randomSequence[1] == 2) {
            burgerDTO.setAnotherAnsBread(breadDB.getBread(1));
        }

        burgerDTO.setAnswerVegetable(vegetableDB.getVegetable(randomSequence[1]));
        if (randomSequence[1] == 1) {
            burgerDTO.setAnotherAnsVeg(vegetableDB.getVegetable(2));
        } else if (randomSequence[1] == 2) {
            burgerDTO.setAnotherAnsVeg(vegetableDB.getVegetable(1));
        }

        burgerDTO.setAnswerPatty(pattyDB.getPatty(randomSequence[2]));
        if (randomSequence[2] == 1) {
            burgerDTO.setAnotherAnsPat(pattyDB.getPatty(2));
        } else if (randomSequence[2] == 2) {
            burgerDTO.setAnotherAnsPat(pattyDB.getPatty(1));
        }

        burgerDTO.setAnswerSource(sourceDB.getSource(randomSequence[3]));
        if (randomSequence[3] == 1) {
            burgerDTO.setAnotherAnsSou(sourceDB.getSource(2));
        } else if (randomSequence[3] == 2) {
            burgerDTO.setAnotherAnsSou(sourceDB.getSource(1));
        }

        burgerRepository.getResult(new IngredientEntity())

        ingredientEntity.setSequence(randomSequence);

        System.out.println(result + "이 BurgerService로 넘어왔습니다.");
      
        return null;
    }

}
