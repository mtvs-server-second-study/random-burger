package com.onemorething.application.view;

import com.onemorething.application.controller.BurgerController;
import com.onemorething.common.BurgerDTO;

import java.util.Scanner;

public class BurgerView {
    /*
     main ,scanner 입력, 결과 출력
     */
//    BurgerDTO burgerDTO = new BurgerDTO();
    BurgerController burgerController = new BurgerController();
    private String bread;
    private String vegetable;
    private String patty;
    private String source;
    Scanner sc = new Scanner(System.in);

    /* 설명. 게임 시작 */
    public void startGame() {


        /* 설명. 시작 알림 */
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

        /* 설명. 빵 선택 질문 */
        System.out.println("빵를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        /* 설명. 빵 선택 */
        bread = sc.next();

        /* 설명. 야채 선택 질문 */
        System.out.println("야채를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        /* 설명. 야채 선택*/
        vegetable = sc.next();      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 패티 선택 질문 */
        System.out.println("패티를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        /* 설명. 패티 선택 */
//        char answer = sc.next().charAt(0);    // 필기. 한 문자로 받기
        patty = sc.next();      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 소스 선택 질문 */
        System.out.println("소스를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        /* 설명. 소스 선택 */
        source = sc.next();      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 선택 사항들 컨트롤러로 전달 */
        BurgerDTO result = new BurgerDTO(bread, vegetable, patty, source);
        burgerController.makeBurger(result);

    }
}



        



