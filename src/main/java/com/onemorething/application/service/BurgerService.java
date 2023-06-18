package com.onemorething.application.service;

import com.onemorething.common.AnotherAnswerDTO;
import com.onemorething.common.AnotherResultDTO;
import com.onemorething.common.AnswerDTO;
import com.onemorething.common.ResultDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.domain.repository.IngredientRepository;
import com.onemorething.domain.service.BurgerDomainService;
import com.onemorething.infra.db.*;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BurgerService {

    BurgerRepository burgerRepository = new BurgerRepository();
    IngredientRepository ingredientRepository = new IngredientRepository();
    BurgerDomainService burgerDomainService = new BurgerDomainService();

    int breadNum=0;
    int vegetableNum=0;
    int pattyNum=0;
    int sourceNum=0;

    /* 설명. 입력 검증 로직 */
    public String getInputService(Scanner sc, String option1, String option2) {
        String input = burgerDomainService.getInput(sc, option1, option2);
        return input;
    }

    /* 설명. 버거 조리 */
    public String makeBurgerService() {

        /* 설명. 선택지 랜덤 번호 부여 */
        setRandomNumber();

        /* 설명. 부여된 랜덤 번호로 해당하는 재료 선택 */
        String answerBread = ingredientRepository.getBread(breadNum);
        String answerVegetable = ingredientRepository.getVegetable(vegetableNum);
        String answerPatty = ingredientRepository.getPatty(pattyNum);
        String answerSource = ingredientRepository.getSource(sourceNum);

        /* 설명. 선택된 재료들로 일치하는 버거 조회 */
        String result = burgerRepository.getResult(new BurgerEntity(answerBread, answerVegetable, answerPatty, answerSource));
        return  result;
    }

    /* 설명. 재료들 이름 반환 */
    public ResultDTO setIngredientService() {

        /* 설명. 선택된 재료들 이름 반환 */
        ResultDTO result = new ResultDTO(ingredientRepository.getBread(breadNum), ingredientRepository.getVegetable(vegetableNum),
                ingredientRepository.getPatty(pattyNum), ingredientRepository.getSource(sourceNum));

        return result;
    }

    /* 설명. 선택지 외 재료 선정 */
    public AnotherResultDTO setAnotherIngredientService() {

        /* 설명. 선택지 외로 번호 부여 */
        int anotherBreadNum = breadNum == 1? 2 : 1;
        int anotherVegetableNum = vegetableNum == 1? 2 : 1;
        int anotherPattyNum = pattyNum == 1? 2 : 1;
        int anotherSourceNum = sourceNum == 1? 2 : 1;

        /* 설명. 부여된 번호로 해당하는 재료 선정 */
        String anotherAnsBread = ingredientRepository.getBread(anotherBreadNum);
        String anotherAnsVegetable = ingredientRepository.getVegetable(anotherVegetableNum);
        String anotherAnsPatty = ingredientRepository.getPatty(anotherPattyNum);
        String anotherAnsSource = ingredientRepository.getSource(anotherSourceNum);

        /* 설명. 선택지 외 재료들 이름 반환*/
        AnotherResultDTO result = new AnotherResultDTO(anotherAnsBread, anotherAnsVegetable, anotherAnsPatty, anotherAnsSource);

        return result;
    }

    public void setRandomNumber() {

        /* 설명. 도메인 Service 로직 */
        /* 설명. 난수 배열 발생기, 자연수 4개, 1 혹은 2 */
        int[] randomSequence = burgerDomainService.getRandomInt(4, 1, 2);

        /* 설명. 랜덤 값 필드 부여 */
        breadNum = randomSequence[0];
        vegetableNum = randomSequence[1];
        pattyNum = randomSequence[2];
        sourceNum = randomSequence[3];

    }

}
