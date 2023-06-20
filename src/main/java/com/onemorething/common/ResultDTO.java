package com.onemorething.common;

import lombok.*;


public class ResultDTO {

    private String burger;

    /* 설명. 선택된 빵 */
    private String bread;

    /* 설명. 선택된 채소 */
    private String vegetable;

    /* 설명. 선택된 패티 */
    private String patty;

    /* 설명. 선택된 소스 */
    private String source;

    public ResultDTO(String burger, String bread, String vegetable, String patty, String source) {
        this.burger = burger;
        this.bread = bread;
        this.vegetable = vegetable;
        this.patty = patty;
        this.source = source;
    }

    public  ResultDTO(String burger){
        this.burger = burger;
    };


    public String getBurger() {
        return burger;
    }

    public String getBread(){
        return bread;
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
