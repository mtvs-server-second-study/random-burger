package com.onemorething.application.controller;


import com.onemorething.application.service.BurgerService;
import com.onemorething.common.AnswerDTO;
import org.springframework.stereotype.Controller;

@Controller
public class BurgerController {
    /*
    view에서 받은 입력을 Application.service 전달
    로직거치고, 결과를 view에 전송
     */

    AnswerDTO answerDTO = new AnswerDTO();
    BurgerService burgerService = new BurgerService();

    public String makeBurger(AnswerDTO result) {

        System.out.println(result + "이 BurgerController로 넘어왔습니다.");

       String realResult = burgerService.makeBurger(result);

        System.out.println("realResult = " + realResult);
        return realResult;
    }

}
