package com.onemorething.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AnotherResultDTO {

    /* 설명. 선택지 외 빵 이름 */
    private String anotherBread;

    /* 설명. 선택지 외 채소 이름 */
    private String anotherVegetable;

    /* 설명. 선택지 외 패티 이름*/
    private String anotherPatty;

    /* 설명. 선택지 외 소스 이름 */
    private String anotherSource;
}
