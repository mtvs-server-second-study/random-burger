package com.onemorething.application.controller;


import com.onemorething.application.service.BurgerService;
import com.onemorething.common.AnotherAnswerDTO;
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

    public String makeBurger(AnswerDTO answer) {

       String result = burgerService.makeBurgerService(answer);

        return result;
    }

    public AnotherAnswerDTO anotherAnswer(AnotherAnswerDTO answer){

        AnotherAnswerDTO result = burgerService.anotherAnswerService(answer);

        return result;
    }

}
