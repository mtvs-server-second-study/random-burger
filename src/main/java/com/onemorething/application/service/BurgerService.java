package com.onemorething.application.service;

import com.onemorething.common.AnotherAnswerDTO;
import com.onemorething.common.AnswerDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.entity.IngredientEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.domain.service.BugerDomainService;
import com.onemorething.infra.db.*;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {

    BurgerEntity burgerEntity = BurgerEntity.getBurgerEntity();
    IngredientEntity ingredientEntity = new IngredientEntity();

    BreadDB breadDB;
    VegetableDB vegetableDB;
    PattyDB pattyDB;
    SourceDB sourceDB;
    AnswerDTO answerDTO;
    AnotherAnswerDTO anotherAnswerDTO;
    BurgerRepository burgerRepository;
    BugerDomainService bugerDomainService;

    public String makeBurger(AnswerDTO result) {
//
//        int[] randomSequence = bugerDomainService.getRandomInt(4, 3);
//
//        answerDTO.setAnswerBread(breadDB.getBread(randomSequence[0])); // 필기. 사용자 답
//        if (randomSequence[0] == 1) {
//            anotherAnswerDTO.setAnotherAnsBread(breadDB.getBread(2));  //  필기. 사용자가 선택하지 않은 답( 추후에 결과 공개를 위해 )
//        } else if (randomSequence[1] == 2) {
//            anotherAnswerDTO.setAnotherAnsBread(breadDB.getBread(1));
//        }
//
//        answerDTO.setAnswerVegetable(vegetableDB.getVegetable(randomSequence[1]));
//        if (randomSequence[1] == 1) {
//            anotherAnswerDTO.setAnotherAnsVeg(vegetableDB.getVegetable(2));
//        } else if (randomSequence[1] == 2) {
//            anotherAnswerDTO.setAnotherAnsVeg(vegetableDB.getVegetable(1));
//        }
//
//        answerDTO.setAnswerPatty(pattyDB.getPatty(randomSequence[2]));
//        if (randomSequence[2] == 1) {
//            anotherAnswerDTO.setAnotherAnsPat(pattyDB.getPatty(2));
//        } else if (randomSequence[2] == 2) {
//            anotherAnswerDTO.setAnotherAnsPat(pattyDB.getPatty(1));
//        }
//
//        answerDTO.setAnswerSource(sourceDB.getSource(randomSequence[3]));
//        if (randomSequence[3] == 1) {
//            anotherAnswerDTO.setAnotherAnsSou(sourceDB.getSource(2));
//        } else if (randomSequence[3] == 2) {
//            anotherAnswerDTO.setAnotherAnsSou(sourceDB.getSource(1));
//        }

//        burgerRepository.getResult(new IngredientEntity())

//        ingredientEntity.setSequence(randomSequence);

        System.out.println(result + "이 BurgerService로 넘어왔습니다.");


      
        return null;
    }

}
