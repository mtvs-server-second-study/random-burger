package com.onemorething;

import com.onemorething.application.view.BurgerView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ContextConfiguration.class);
//
//        String[] beanNames = context.getBeanDefinitionNames();   // 문자열 배열 형태로 이름만 반환
//        for (String beanName : beanNames) {
//            System.out.println("beanName = " + beanName);
//        }

        BurgerView burgerView = new BurgerView();
        burgerView.startGame();
    }
}
