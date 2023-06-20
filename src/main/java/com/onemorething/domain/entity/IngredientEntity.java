package com.onemorething.domain.entity;

public class IngredientEntity {

    private final int sequence;   // 설명. 재료 번호

    private final String name;    // 설명. 재료 이름

    public IngredientEntity(int sequence, String name) {
        this.sequence = sequence;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
