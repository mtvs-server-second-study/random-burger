package com.onemorething.application.service;

import com.onemorething.common.AnotherAnswerDTO;
import com.onemorething.common.AnswerDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.domain.repository.IngredientRepository;
import com.onemorething.domain.service.BurgerDomainService;
import com.onemorething.infra.db.*;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {

    BreadDB breadDB = new BreadDB();
    BurgerRepository burgerRepository = new BurgerRepository();
    IngredientRepository ingredientRepository = new IngredientRepository();
    BurgerDomainService burgerDomainService = new BurgerDomainService();

    int breadNum=0;
    int anotherBreadNum=0;
    int vegetableNum=0;
    int anotherVegetableNum=0;
    int pattyNum=0;
    int anotherPattyNum=0;
    int sourceNum=0;
    int anotherSourceNum=0;

    public String makeBurgerService(AnswerDTO answer) {

        // 설명.
        randomNumber();

        String answerBread = ingredientRepository.getBread(breadNum);
        String answerVegetable = ingredientRepository.getVegetable(vegetableNum);
        String answerPatty = ingredientRepository.getPatty(pattyNum);
        String answerSource = ingredientRepository.getSource(sourceNum);

       String test = burgerRepository.getResult(new BurgerEntity(answerBread, answerVegetable, answerPatty, answerSource));
        return  test;
    }

    public AnotherAnswerDTO anotherAnswerService(AnotherAnswerDTO anotherAnswer) {

        int anotherBreadNum = breadNum == 1? 2 : 1;
        int anotherVegetableNum = vegetableNum == 1? 2 : 1;
        int anotherPattyNum = pattyNum == 1? 2 : 1;
        int anotherSourceNum = sourceNum == 1? 2 : 1;

        String anotherAnsBread = ingredientRepository.getBread(anotherBreadNum);
        String anotherAnsVegetable = ingredientRepository.getVegetable(anotherVegetableNum);
        String anotherAnsPatty = ingredientRepository.getPatty(anotherPattyNum);
        String anotherAnsSource = ingredientRepository.getSource(anotherSourceNum);

        AnotherAnswerDTO anotherAnswerDTO = new AnotherAnswerDTO(anotherAnsBread, anotherAnsVegetable, anotherAnsPatty, anotherAnsSource);
        return anotherAnswerDTO;
    }

    public void randomNumber() {

        /* 설명. 도메인 Service 로직 */
        /* 설명. 난수 배열 발생기, 자연수 4개, 1 혹은 2 */
        int[] randomSequence = burgerDomainService.getRandomInt(4, 1, 2);

        breadNum = randomSequence[0];
        vegetableNum = randomSequence[1];
        pattyNum = randomSequence[2];
        sourceNum = randomSequence[3];

    }

}
