package com.onemorething.domain.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IngredientEntity {

    private int sequence;
//    private String answer;
    private String name;
    private int price;

}
