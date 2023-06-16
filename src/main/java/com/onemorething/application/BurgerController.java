package com.onemorething.application;

import com.onemorething.common.BurgerDTO;
import com.onemorething.domain.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class BurgerController {

    private final BurgerService burgerService;

    
    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    public void findRandomSource(char answer) {
    }
    
    /*
    view에서 받은  입력을 Application.service 전달
    로직거치고, 결과를 view에 전송
     */
}
