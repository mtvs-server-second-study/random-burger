package com.onemorething.application.service;

import com.onemorething.common.AnotherResultDTO;
import com.onemorething.common.ResultDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.domain.repository.IngredientRepository;
import com.onemorething.domain.service.BurgerDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BurgerService {

    private final BurgerRepository burgerRepository;
    private final IngredientRepository ingredientRepository;
    private final BurgerDomainService burgerDomainService;

    private int breadNum;
    private int vegetableNum;
    private int pattyNum;
    private int sourceNum;

    @Autowired
    public BurgerService(BurgerRepository burgerRepository, IngredientRepository ingredientRepository, BurgerDomainService burgerDomainService) {
        this.burgerRepository = burgerRepository;
        this.ingredientRepository = ingredientRepository;
        this.burgerDomainService = burgerDomainService;

        initFieldWithRandomValue();
    }

    private void initFieldWithRandomValue() {
        int[] randomSequence = burgerDomainService.getRandomInt(4, 1, 2);
        breadNum = randomSequence[0];
        vegetableNum = randomSequence[1];
        pattyNum = randomSequence[2];
        sourceNum = randomSequence[3];
    }

    /** <pre>
     *   입력 값에 대한 검증을 처리하는 로직
     * </pre>
     * @Param option1 파라미터에 대한 설명
     * @Param option2 파라미터에 대한 설명
     * @Return 리턴값에 대한 설명
     * @Author 작성자명
     * @History 2023-06-19 최초 작성함 (김진호)
     * */
    public String getInputService(Scanner sc, String option1, String option2) {
        String input = burgerDomainService.getInput(sc, option1, option2);
        return input;
    }

    public ResultDTO makeBurgerService() {

        String answerBread = ingredientRepository.getBread(breadNum);
        String answerVegetable = ingredientRepository.getVegetable(vegetableNum);
        String answerPatty = ingredientRepository.getPatty(pattyNum);
        String answerSource = ingredientRepository.getSource(sourceNum);

        String burger = burgerRepository.getResult(new BurgerEntity(answerBread, answerVegetable, answerPatty, answerSource)).getBurgerName();
        return new ResultDTO(burger, answerBread, answerVegetable, answerPatty, answerSource);
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

}
