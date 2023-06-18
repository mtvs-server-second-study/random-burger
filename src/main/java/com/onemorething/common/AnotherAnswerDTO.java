package com.onemorething.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AnotherAnswerDTO {

    /* 설명. 선택지 외 빵*/
    private String anotherAnsBread;

    /* 설명. 선택지 외 채소 */
    private String anotherAnsVeg;

    /* 설명. 선택지 외 패티 */
    private String anotherAnsPat;

    /* 설명. 선택지 외 소스*/
    private String anotherAnsSou;
}
