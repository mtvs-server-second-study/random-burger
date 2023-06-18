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

    /* 설명. 재료 이름 */
    private String name;

    /* 설명. 재료 가격 */
    private int price;

}
