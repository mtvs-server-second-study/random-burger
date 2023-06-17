package com.onemorething.domain.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IngredientEntity {

    /* 설명. 번호 */
    private int sequence;
//    private int seqBread;
//    private int seqVegetable;
//    private int seqPatty;
//    private int seqSource;

    /* 설명. 재료 이름 */
    private String name;
//    private String bread;
//    private String vegetable;
//    private String patty;
//    private String source;

    /* 설명. 재료 가격 */
    private int price;
//    private int priceBread;
//    private int priceVegetable;
//    private int pricePatty;
//    private int priceSource;

}
