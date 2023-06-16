package com.onemorething.application.view;

import com.onemorething.application.controller.BurgerController;
import com.onemorething.common.BurgerDTO;
import com.onemorething.domain.service.BugerDomainService;

import java.util.Scanner;

public class BurgerView {
    /*
     main ,scanner 입력, 결과 출력
     */
//    BurgerDTO burgerDTO = new BurgerDTO();
    BurgerController burgerController = new BurgerController();
    BugerDomainService burgerDomainService = new BugerDomainService();

    String bread;
    String vegetable;
    String patty;
    String source;


    Scanner sc = new Scanner(System.in);

    public void startGame() {


        boolean iter = true;
        while (iter) {
            System.out.println("=^=^=^=^=Random Burger=^=^=^=^=");
            System.out.println();
            System.out.println("게임을 시작하시겠습니까?");
            System.out.println();
            System.out.println("1. YES                2. No");

            int result = sc.nextInt();

            if (result == 1) {
                iter = false;
            }
        }

        System.out.println("빵를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");

        bread = burgerDomainService.getInput(sc, "A", "B");

        System.out.println("야채를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");

        vegetable = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        System.out.println("패티를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");

//        char answer = sc.next().charAt(0);    // 필기. 한 문자로 받기
        patty = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        System.out.println("소스를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");

        source = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계



        BurgerDTO result = new BurgerDTO(bread, vegetable, patty, source);
        burgerController.makeBurger(result);

    }
}



        



