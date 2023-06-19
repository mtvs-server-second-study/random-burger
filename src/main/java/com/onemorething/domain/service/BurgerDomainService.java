package com.onemorething.domain.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Component
public class BurgerDomainService { //로직

    /* 설명. 원하는 입력 외 차단, 소문자 -> 대문자 변경 */
    public String getInput(Scanner sc, String option1, String option2) {
        String input = sc.next().toUpperCase();

        while (!input.equals(option1) && !input.equals(option2)) {
            System.out.println("A, a, B, b 만 입력 할 수 있습니다. 다시 입력해주세요!");
            input = sc.next().toUpperCase();
        }

        return input;
    }

    // 설명. 정한 범위에서 자연수가 나오는 난수 발생기
    public int[] getRandomInt(int index, int lowerBound, int highBound){

        int[] randomSequence = new int[index];
        for (int i=0; i<randomSequence.length; i++){
            randomSequence[i] = (int)(Math.random()*(highBound - lowerBound +1)) + 1;
        }
        return randomSequence;
    }

}
