package com.onemorething.application.view;

import com.onemorething.application.controller.BurgerController;
import com.onemorething.common.BurgerDTO;

import java.util.Scanner;

public class BurgerView {
    /*
     main ,scanner 입력, 결과 출력
     */
    BurgerDTO burgerDTO = new BurgerDTO();
    BurgerController burgerController = new BurgerController();

    Scanner sc=new Scanner(System.in);

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
                burgerPatty();
                iter = false;
            }
        }
    }

    private void burgerBread() {

    }

    private void burgerPatty() {
        System.out.println("패티를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");

//        char answer = sc.next().charAt(0);    // 필기. 한 문자로 받기
        String answer = sc.next();      // 필기. 문자열로 받아 service로 로직 설계
        System.out.println(answer); // 값 확인 용

        // 필기. 컨트롤러 메소드 실행
        burgerController.answerPatty(answer);

    }
}
