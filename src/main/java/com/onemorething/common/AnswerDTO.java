package com.onemorething.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AnswerDTO {  //입력값 담음

    /* 설명. 랜덤 빵 */
    private String answerBread;

    /* 설명. 랜덤 야채 */
    private String answerVegetable;

    /* 설명. 랜덤 패티 */
    private String answerPatty;

    /* 설명. 랜덤 소스 */
    private String answerSource;

}

