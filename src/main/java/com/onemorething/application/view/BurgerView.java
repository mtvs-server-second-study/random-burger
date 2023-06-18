package com.onemorething.application.view;

import com.onemorething.application.controller.BurgerController;
import com.onemorething.common.AnotherResultDTO;
import com.onemorething.common.ResultDTO;
import com.onemorething.domain.service.BurgerDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BurgerView {
    @Autowired
    BurgerController burgerController;
    @Autowired
    BurgerDomainService burgerDomainService;
    private String bread;
    private String anotherBread;
    private String vegetable;
    private String anotherVegetable;
    private String patty;
    private String anotherPatty;
    private String source;
    private String anotherSource;

    Scanner sc = new Scanner(System.in);

    /* 설명. 게임 시작 */
    public void startGame() {

        /* 설명. 로고 */
        System.out.println(
                 "_____                 _                   ____ \n" +
                "|  __ \\               | |                 |  _ \\ \n" +
                "| |__) |__ _ _ __   __| | ___  _ __ ___   | |_) |_   _ _ __ __ _  ___ _ __ \n" +
                "|  _  /  _` | '_ \\ / _` |/ _ \\| '_ ` _ \\  |  _ <| | | | '__/ _` |/ _ \\ '__| \n" +
                "| | \\ \\ (_| | | | | (_| | (_) | | | | | | | |_) | |_| | | | (_| |  __/ |   \n" +
                "|_|  \\_\\__,_|_| |_|\\__,_|\\___/|_| |_| |_| |____/ \\__,_|_|  \\__, |\\___|_| \n" +
                "                                                            __/ |\n" +
                "                                                            |___/");
      
        /* 햄버거 가게 */
        System.out.println(
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
                "__________________________________________________________________\n\n\n" );
      
        /* 설명. 시작 알림 */
        while (true) {
            System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
            System.out.println("랜덤 버거집에 입장하시겠습니까?🎮\n");
            System.out.println("1. Yes               2. No\n");

            if (sc.hasNextInt()) {   // 필기. 입력이 Int이면 true, 아니면 false
                int answer = sc.nextInt();
                if (answer == 1) {
                    System.out.println("띠링~🛎️");
                    System.out.println("?? : 이랏샤이마셍~~~!\n");
                    break;
                }
                if (answer != 1 && answer != 2) {
                    System.out.println("1 혹은 2로만 작성해주세요!");
                } else if (answer == 2) {   // 필기. 게임 종료
                    System.out.println("게임을 종료합니다.");
                    return;
                }
            } else {    // 필기. 문자 입력 시
                sc.next();  // this is important, consume the invalid token
                System.out.println("1 혹은 2로만 작성해주세요!");
            }
        }

        /* 설명. 빵 선택 질문 */
        System.out.println("빵을 선택합니다.🥯 알파벳을 입력해주세요.😋\n");
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
        System.out.print("빵 선택 : ");
        bread = burgerController.getInputController(sc, "A", "B");
        anotherBread = bread.trim().equals("A")? "B" : "A";
        System.out.println("  ████  ████      ██████  ████  ██       \n" +
                        "  ██                            ██       \n" +
                        "    ████████████████████████████         \n");


        /* 설명. 야채 선택 질문 */
        System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
        System.out.println("야채를 선택합니다.🥬 알파벳을 입력해주세요.😋\n");
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
        System.out.print("채소 선택 : ");
        vegetable = burgerController.getInputController(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계
        anotherVegetable = vegetable.trim().equals("A")? "B":"A";
        System.out.println("██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██     \n" +
                           "  ██░░██░░░░██████░░░░░░██░░░░████       \n\n\n");

        /* 설명. 패티 선택 질문 */
        System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
        System.out.println("패티를 선택합니다.🥩 알파벳을 입력해주세요.😋\n");
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
        System.out.print("패티 선택 : ");
        patty = burgerController.getInputController(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계
        anotherPatty = patty.trim().equals("A")? "B":"A";
        System.out.println("██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██    \n" +
                           "  ████████████████████████████████        \n\n\n");

        /* 설명. 소스 선택 질문 */
        System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
        System.out.println("소스를 선택합니다.🧂 알파벳을 입력해주세요.😋\n");
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
        System.out.print("소스 선택 : ");
        source = burgerController.getInputController(sc, "A", "B");      // 필기. 문자열로 받아 service로 로직 설계
        anotherSource = source.trim().equals("A")? "A" : "B";
        System.out.println("████████████████████████████████████    \n\n\n");

        System.out.println("모든 선택이 완료되었습니다.");
        System.out.println("자, 이제 30년 경력의 주방장이 요리를 시작합니다~~!");
        System.out.println("치익~~~~~");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* 설명. 선택 사항들 컨트롤러로 전달 */
        String resultBurger = burgerController.makeBurger();
        ResultDTO ingredient = burgerController.setIngCtrl();
        AnotherResultDTO anotherIngredient = burgerController.setAnotherIngCtrl();

        /* 설명.*/
        System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=Random Burger=^=^=^=^=^=^=^=^=^=^=^=^=\n");
        System.out.println("주문하신 버거가 나왔습니다!🍔🍔🍔🍔🍔\n");
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
        System.out.println("이름하야~~~   " + "🍔🍔" + resultBurger + "🍔🍔");
        System.out.println("선택된 재료 : ");
        System.out.println("빵 : " + ingredient.getBread() + ", 채소 : " + ingredient.getVegetable() +
                ", 패티 : " + ingredient.getPatty() + ", 소스 : " + ingredient.getSource());

        System.out.println("재료가 공개된 질문을 보시겠습니까?\n");
        System.out.println("1. Yes               2. 종료(아무 키나 입력해주세요.)\n");
        int answer = sc.nextInt();
        if (answer == 1) {

            System.out.println("선택지를 오픈합니다.\n");
            System.out.println("선택된 재료 : " + bread + ", " + vegetable + ", " + patty + ", " + source);
            System.out.println("빵을 선택합니다.🥯 알파벳을 입력해주세요.😋\n");
            if (bread.trim().equals("A")) {
                System.out.println("A : " + ingredient.getBread() + "                     B : " + anotherIngredient.getAnotherBread() + "\n");
            } else {
                System.out.println("A : " + anotherIngredient.getAnotherBread() + "                     B : " + ingredient.getBread() + "\n");
            }
            System.out.println("야채를 선택합니다.🥬 알파벳을 입력해주세요.😋\n");
            if (vegetable.trim().equals("A")) {
                System.out.println("A : " + ingredient.getVegetable() + "                     B : " + anotherIngredient.getAnotherVegetable() + "\n");
            } else {
                System.out.println("A : " + anotherIngredient.getAnotherVegetable() + "                     B : " + ingredient.getVegetable() + "\n");
            }
            System.out.println("패티를 선택합니다.🥩 알파벳을 입력해주세요.😋\n");
            if (patty.trim().equals("A")) {
                System.out.println("A : " + ingredient.getPatty() + "                     B : " + anotherIngredient.getAnotherPatty() + "\n");
            } else {
                System.out.println("A : " + anotherIngredient.getAnotherPatty() + "                     B : " + ingredient.getPatty() + "\n");
            }
            System.out.println("소스를 선택합니다.🧂 알파벳을 입력해주세요.😋\n");
            if (source.trim().equals("A")) {
                System.out.println("A : " + ingredient.getSource() + "                     B : " + anotherIngredient.getAnotherSource() + "\n");
            } else {
                System.out.println("A : " + anotherIngredient.getAnotherSource() + "                     B : " + ingredient.getSource() + "\n");
            }

        } else {
            System.out.println("게임을 종료합니다.");
            return;
        }

    }
}



        



