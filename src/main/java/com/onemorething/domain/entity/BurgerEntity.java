package com.onemorething.domain.entity;

import lombok.*;


public class BurgerEntity { //DB에 넣을것 파싱

    /* 설명. 버거 번호 */
    private int sequence;
    /* 설명. 버거 이름*/
    private String burgerName;
    /* 설명. 빵 이름  */
    private String bread;
    /* 설명. 야채 이름 */
    private String vegetable;
    /* 설명. 패티 이름 */
    private String patty;
    /* 설명. 소스 이름 */
    private String source;
    /* 설명. 버거 가격 */
    private int price;

    public BurgerEntity(int sequence, String burgerName, String bread, String vegetable, String patty, String source, int price){
        this.sequence = sequence;
        this.burgerName = burgerName;
        this.bread = bread;
        this.vegetable = vegetable;
        this.patty = patty;
        this.source = source;
    }

    public BurgerEntity(String bread, String vegetable, String patty, String source) {
        this.bread = bread;
        this.vegetable = vegetable;
        this.patty = patty;
        this.source = source;
    }

    public String getBread() {
        return bread;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getVegetable() {
        return vegetable;
    }

    public String getPatty() {
        return patty;
    }

    public String getSource() {
        return source;
    }
}