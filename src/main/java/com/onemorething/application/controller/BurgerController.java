package com.onemorething.application.controller;


import com.onemorething.application.service.BurgerService;
import com.onemorething.common.BurgerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class BurgerController {
    /*
    view에서 받은 입력을 Application.service 전달
    로직거치고, 결과를 view에 전송
     */

    BurgerDTO burgerDTO = new BurgerDTO();
    BurgerService burgerService = new BurgerService();

    public String answerPatty(String answer) {

        System.out.println(answer + "이 BurgerController로 넘어왔습니다.");

        return null;
    }

}
