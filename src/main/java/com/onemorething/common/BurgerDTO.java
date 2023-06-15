package com.onemorething.common;

import lombok.*;

import java.io.IOException;

@Getter
@Setter
@ToString
public class BurgerDTO {  //입력값 담음

    private static BurgerDTO dto = new BurgerDTO();

    private int index;
    private String name;
    private String bread;
    private String vegetable;
    private String source;
    private String answerPatty;

    public static BurgerDTO getDto(){
        return dto;
    }

}

