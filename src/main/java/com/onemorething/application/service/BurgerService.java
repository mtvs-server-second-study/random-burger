package com.onemorething.application.service;

import com.onemorething.common.AnswerDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.domain.service.BurgerDomainService;
import com.onemorething.infra.db.*;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {

    BreadDB breadDB = new BreadDB();
//    VegetableDB vegetableDB;
//    PattyDB pattyDB;
//    SourceDB sourceDB;
//    AnswerDTO answerDTO;
//    AnotherAnswerDTO anotherAnswerDTO;
    BurgerRepository burgerRepository = new BurgerRepository();
    IngredientRepository ingredientRepository = new IngredientRepository();

    BreadDB breadDB;
    VegetableDB vegetableDB;
    PattyDB pattyDB;
    SourceDB sourceDB;
    AnswerDTO answerDTO;
    AnotherAnswerDTO anotherAnswerDTO;
    BurgerRepository burgerRepository;
    BurgerDomainService burgerDomainService;

    public String makeBurger(AnswerDTO result) {

        // result = ABBA

        /* 설명. 난수 배열 발생기, 자연수 4개, 1 혹은 2 */
        int[] randomSequence = burgerDomainService.getRandomInt(4, 1, 2);
        // 1 2 2 1

        int breadNum = randomSequence[0];
        int anotherBreadNum = breadNum == 1?2:1;
        int vegetableNum = randomSequence[1];
        int anotherVegetableNum = vegetableNum == 1? 2 : 1;
        int pattyNum = randomSequence[2];
        int anotherPattyNum = pattyNum == 1? 2 : 1;
        int sourceNum = randomSequence[3];
        int anotherSourceNum = sourceNum == 1? 2 : 1;

        String answerBread = ingredientRepository.getBread(breadNum);
        String anotherAnsBread = ingredientRepository.getBread(anotherBreadNum);
        String answerVegetable = ingredientRepository.getVegetable(vegetableNum);
        String anotherAnsVegetable = ingredientRepository.getVegetable(anotherVegetableNum);
        String answerPatty = ingredientRepository.getPatty(pattyNum);
        String anotherAnsPatty = ingredientRepository.getPatty(anotherPattyNum);
        String answerSource = ingredientRepository.getSource(sourceNum);
        String anotherAnsSource = ingredientRepository.getSource(anotherSourceNum);

       String test = burgerRepository.getResult(new BurgerEntity(answerBread, answerVegetable, answerPatty, answerSource));
//       return burgerRepository.getResult(new BurgerEntity(answerBread, answerVegetable, answerPatty, answerSource));
        return  test;
    }

}
