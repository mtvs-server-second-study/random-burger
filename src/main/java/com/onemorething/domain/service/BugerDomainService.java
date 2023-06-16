package com.onemorething.domain.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BugerDomainService { //로직
    /*
   1. 입력값 Char
   2. if toEquals a b A B 아니면 다 처내면 됨

     */

    public String getInput(Scanner sc, String option1, String option2) {
        String input = sc.next().toUpperCase();

        while (!input.equals(option1) && !input.equals(option2)) {
            System.out.println("A, a, B, b 만 입력 할 수 있습니다. 다시 입력해주세요!");
            input = sc.next().toUpperCase();
        }

        return input;
    }



}
