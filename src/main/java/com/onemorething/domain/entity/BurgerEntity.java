package com.onemorething.domain.entity;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
@ToString
public class BurgerEntity { //DB에 넣을것 파싱

    private static BurgerEntity entity = new BurgerEntity();

    private String bread;
    private String source;
    private String patty;
    private String vegetable;

    public static BurgerEntity getBurgerEntity() {
        return entity;
    }
}
