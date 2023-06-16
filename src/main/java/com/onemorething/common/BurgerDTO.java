package com.onemorething.common;

import lombok.*;

import java.io.IOException;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BurgerDTO {  //입력값 담음

    private String answerBread;
    private String answerVegetable;
    private String answerPatty;
    private String answerSource;

}

