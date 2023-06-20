package com.onemorething.domain.entity;


public class BurgerEntity {

    private String burgerName;
    private String bread;
    private String vegetable;
    private String patty;
    private String source;

    public BurgerEntity(String burgerName) {
        this.burgerName = burgerName;
    }

    public BurgerEntity( String burgerName, String bread, String vegetable, String patty, String source){
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