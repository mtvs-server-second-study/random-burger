package com.onemorething.common;

import lombok.*;

import java.io.IOException;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BurgerDTO {  //입력값 담음

    /* 설명. 랜덤 빵 */
    private String answerBread;
    private String anotherAnsBread;

    /* 설명. 랜덤 야채 */
    private String answerVegetable;
    private String anotherAnsVeg;

    /* 설명. 랜덤 패티 */
    private String answerPatty;
    private String anotherAnsPat;

    /* 설명. 랜덤 소스 */
    private String answerSource;
    private String anotherAnsSou;

}

