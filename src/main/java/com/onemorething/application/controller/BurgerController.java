package com.onemorething.application.controller;


import com.onemorething.application.service.BurgerService;
import com.onemorething.common.AnotherResultDTO;
import com.onemorething.common.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class BurgerController {

    private final BurgerService burgerService;
    @Autowired
    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    /* 설명. 입력 검증 로직 */
    public String getInputController(Scanner sc, String option1, String option2) {
        String input = burgerService.getInputService(sc, option1, option2);
        return input;
    }

    /* 설명. 선택된 재료들을 application.service에 전달 / 완성된 버거 반환*/
    public String makeBurger() {

       String result = burgerService.makeBurgerService();

        return result;
    }

    /* 설명. 선택된 재료들을 application.service에 전달 / 선택된 재료들 반환 */
    public ResultDTO setIngCtrl() {
        ResultDTO resultDTO = burgerService.setIngredientService();
        return resultDTO;
    }

    /* 설명. 선택지 외 재료들을 application.service에 전달 / 선택지 재료들 반환 */
    public AnotherResultDTO setAnotherIngCtrl() {
        AnotherResultDTO resultDTO = burgerService.setAnotherIngredientService();
        return resultDTO;
    }

}
