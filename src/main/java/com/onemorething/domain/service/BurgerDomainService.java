package com.onemorething.domain.service;

import com.onemorething.infra.db.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BurgerDomainService { //로직
    /*
   1. 입력값 Char
   2. if toEquals a b A B 아니면 다 처내면 됨

     */

    @Autowired
    private BreadDB breadDB;

    @Autowired
    private BurgerDB burgerDB;

    @Autowired
    private PattyDB pattyDB;

    @Autowired
    private SourceDB sourceDB;

    @Autowired
    private VegetableDB vegetableDB;

    public String getInput(Scanner sc, String option1, String option2) {
        String input = sc.next().toUpperCase();

        while (!input.equals(option1) && !input.equals(option2)) {
            System.out.println("A, a, B, b 만 입력 할 수 있습니다. 다시 입력해주세요!");
            input = sc.next().toUpperCase();
        }

        return input;
    }

    // 설명. 정한 범위에서 자연수가 나오는 난수 발생기
    public int[] getRandomInt(int index, int domain){

        int[] randomSequence = new int[index];
        for (int i=0; i<randomSequence.length; i++){
            randomSequence[i] = (int)(Math.random() + domain);   // 설명. 1과 2만 나오는 난수 발생기
        }
        return randomSequence;
    }

    //



}
