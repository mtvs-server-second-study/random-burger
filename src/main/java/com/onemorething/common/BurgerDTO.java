package com.onemorething.common;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
    public class BurgerDTO {  //입력값 담음
        private int index;
        private String name;
        private String bread;
        private String vegetable;
        private String source;
        private String patty;
    }

