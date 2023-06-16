package com.onemorething.application;

import com.onemorething.common.ContextConfiguration;
import com.onemorething.domain.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class View {
    /*
     main ,scanner 입력, 결과 출력
     */
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);


        Scanner sc = new Scanner(System.in);

        System.out.println("4. 소스의 종류를 선택하세요. A or B");
        char answer = sc.next().charAt(0);
        controller.findRandomSource(answer);

//        System.out.println("완성된 버거의 이름은 " +  + "입니다");
        //4번 입력받기
        //Char 으로 입력
        //로직 불러오기 (매번 입력시마다)

    }
}
