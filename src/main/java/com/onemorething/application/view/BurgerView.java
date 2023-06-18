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

        /* 설명. 시작 알림 */
        System.out.println(
                 "_____                 _                   ____ \n" +
                "|  __ \\               | |                 |  _ \\ \n" +
                "| |__) |__ _ _ __   __| | ___  _ __ ___   | |_) |_   _ _ __ __ _  ___ _ __ \n" +
                "|  _  /  _` | '_ \\ / _` |/ _ \\| '_ ` _ \\  |  _ <| | | | '__/ _` |/ _ \\ '__| \n" +
                "| | \\ \\ (_| | | | | (_| | (_) | | | | | | | |_) | |_| | | | (_| |  __/ |   \n" +
                "|_|  \\_\\__,_|_| |_|\\__,_|\\___/|_| |_| |_| |____/ \\__,_|_|  \\__, |\\___|_| \n" +
                "                                                            __/ |\n" +
                "                                                            |___/\n");

        boolean iter = true;
        while (iter) {
//            System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
            System.out.println("게임을 시작하시겠습니까?\n");
            System.out.println("1. YES                2. No\n");
            int result = sc.nextInt();

            /* 설명. No 누를 시 무한 루프*/
            if (result == 1) {
                iter = false;
            }
        }

        /* 설명. 빵 선택 질문 */
        System.out.println("빵를 선택합니다. 알파벳을 입력해주세요. \n");
        System.out.println(
                "         ____                      ____\n" +
                        "        |__   \\                   |__   \\ \n" +
                        "            ) |                       ) |\n" +
                        "           / /                       / /   \n"  +
                        "          |_|                       |_|\n" +
                        "       \\  (_)   /                \\  (_)   /\n" +
                        "        ========                  ========");
        System.out.println("        (1) A                     (2) B\n");
        /* 설명. 빵 선택 */
        bread = burgerDomainService.getInput(sc, "A", "B");

        /* 설명. 야채 선택 질문 */
        System.out.println("야채를 선택합니다. 알파벳을 입력해주세요.\n");
        System.out.println(
                "         ____                      ____\n" +
                        "        |__   \\                   |__   \\ \n" +
                        "            ) |                       ) |\n" +
                        "           / /                       / /   \n"  +
                        "          |_|                       |_|\n" +
                        "       \\  (_)   /                \\  (_)   /\n" +
                        "        ========                  ========");
        System.out.println("        (1) A                     (2) B\n");
        /* 설명. 야채 선택*/
        vegetable = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 패티 선택 질문 */
        System.out.println("패티를 선택합니다. 알파벳을 입력해주세요.\n");
        System.out.println(
                "         ____                      ____\n" +
                        "        |__   \\                   |__   \\ \n" +
                        "            ) |                       ) |\n" +
                        "           / /                       / /   \n"  +
                        "          |_|                       |_|\n" +
                        "       \\  (_)   /                \\  (_)   /\n" +
                        "        ========                  ========");
        System.out.println("        (1) A                     (2) B\n");
        /* 설명. 패티 선택 */
//        char answer = sc.next().charAt(0);    // 필기. 한 문자로 받기
        patty = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 소스 선택 질문 */
        System.out.println("소스를 선택합니다. 알파벳을 입력해주세요.\n");
        System.out.println(
                "         ____                      ____\n" +
                        "        |__   \\                   |__   \\ \n" +
                        "            ) |                       ) |\n" +
                        "           / /                       / /   \n"  +
                        "          |_|                       |_|\n" +
                        "       \\  (_)   /                \\  (_)   /\n" +
                        "        ========                  ========");
        System.out.println("        (1) A                     (2) B\n");
        /* 설명. 소스 선택 */
        source = burgerDomainService.getInput(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계

        /* 설명. 선택 사항들 컨트롤러로 전달 */
        AnswerDTO result = new AnswerDTO(bread, vegetable, patty, source);

        /* 설명.*/
        System.out.println("주문하신 버거가 나왔습니다!\n");
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
        System.out.println("이름하야~~~   " + burgerController.makeBurger(result) + "\n");

    }
}



        



