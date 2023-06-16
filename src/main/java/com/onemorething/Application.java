package com.onemorething;

import com.onemorething.application.view.BurgerView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BurgerView burgerView = new BurgerView();
        burgerView.startGame();
    }
}
