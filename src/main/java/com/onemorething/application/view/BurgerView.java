package com.onemorething.application.view;

import com.onemorething.application.controller.BurgerController;
import com.onemorething.common.AnswerDTO;
import com.onemorething.domain.service.BurgerDomainService;

import java.util.Scanner;

public class BurgerView {
    /*
     main ,scanner 입력, 결과 출력
     */
//    AnswerDTO burgerDTO = new AnswerDTO();
    BurgerController burgerController = new BurgerController();
    BurgerDomainService burgerDomainService = new BurgerDomainService();

    private String bread;
    private String vegetable;
    private String patty;
    private String source;

    Scanner sc = new Scanner(System.in);

    /* 설명. 게임 시작 */
    public void startGame() {

        /* 햄버거 가게 */
        System.out.println("      \n"+
                "                     _______________________\n" +
                "                   ||   AWESOME HAMBURGER   ||\n" +
                "   ________________||______RESTAURANT🍔_____||_____________\n" +
                "  |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_||\n" +
                "  |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|| /|\n" +
                "  |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_||/||\n" +
                "  |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|||/|\n" +
                "  |_|_|_|_|_|_|_|_|_|     _      _     |_|_|_|_|_|_|_|_|_|_|/||\n" +
                "  |_|               |    (_)    (_)    |                 |_|/||\n" +
                "  |_|    RANDOM     |__________________|     SPECIAL     |_||/|\n" +
                "  |_|    BURGER     |_|      ||      |_|     TOPPING     |_|/||\n" +
                "  |_|               |_|      || push |_|    🥯🥬🍖🧂    |_||/|\n" +
                "  |_|               |_|      ||  in  |_|    ❔❔❔❔    |_|/||\n" +
                "  |_|    CHOOSE     |_|     [||]     |_|      RANDOM     |_||/|\n" +
                "  |_| [A]  or  [B]  |_|      ||      |_|      BURGER     |_|/||\n" +
                "  |_|_______________|_|      ||      |_|_________________|_||/|\n" +
                "  |_|_|_|_|_|_|_|_|_|_|______||______|_|_|_|_|_|_|_|_|_|_|_|/||\n" +
                "__|_|_|_|_|_|_|_|_|_|_|______||______|_|_|_|_|_|_|_|_|_|_|_||/________\n" +
                " /     /     /     /     /     /     /     /     /     /     /     /\n" +
                "/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/\n" +
                "__________________________________________________________________\n" );

        /* 햄버거 ascii art */
        System.out.println("        ████████████████████            \n" +
                "      ██                    ██          \n" +
                "    ██    ██          ██      ██        \n" +
                "  ██      ████        ████      ██      \n" +
                "  ██            ████            ██      \n" +
                "  ██                            ██      \n" +
                "████████████████████████████████████    \n" +
                "██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██    \n" +
                "  ████████████████████████████████        _   _      _ _\n" +
                "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██     | | | |    | | |\n" +
                "  ██░░██░░░░██████░░░░░░██░░░░████       | |_| | ___| | | ___\n" +
                "  ████  ████      ██████  ████  ██       |  _  |/ _ \\ | |/ _ \\\n" +
                "  ██                            ██       | | | |  __/ | | (_) |\n" +
                "    ████████████████████████████         |_| |_|\\___|_|_|\\___/");


        /* 설명. 시작 알림 */
        boolean iter = true;
        while (iter) {
            System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=");
            System.out.println();
            System.out.println("게임을 시작하시겠습니까?");
            System.out.println();
            System.out.println("1. YES                2. No");
            System.out.println();

            int result = sc.nextInt();

            if (result == 1) {
                iter = false;
            }
        }

        /* 설명. 빵 선택 질문 */
        System.out.println("빵를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        System.out.println();
        /* 설명. 빵 선택 */
        bread = burgerDomainService.getInput(sc, "A", "B");

        /* 설명. 야채 선택 질문 */
        System.out.println("야채를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println(" ??????           ??????");
        System.out.println("(1) A         (2) B");
        System.out.println();
        /* 설명. 야채 선택*/
        vegetable = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 패티 선택 질문 */
        System.out.println("패티를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        System.out.println();
        /* 설명. 패티 선택 */
//        char answer = sc.next().charAt(0);    // 필기. 한 문자로 받기
        patty = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 소스 선택 질문 */
        System.out.println("소스를 선택합니다. 알파벳을 입력해주세요.");
        System.out.println();
        System.out.println("(1) A         (2) B");
        System.out.println();
        /* 설명. 소스 선택 */
        source = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        System.out.println("");

        /* 설명. 선택 사항들 컨트롤러로 전달 */
        AnswerDTO result = new AnswerDTO(bread, vegetable, patty, source);
//        AnswerDTO result = new AnswerDTO("b", "b", "b", "a");

        System.out.println(burgerController.makeBurger(result));

    }
}



        



