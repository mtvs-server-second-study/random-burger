package com.onemorething.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResultDTO {

    /* 설명. 선택된 빵 */
    private String bread;

    /* 설명. 선택된 채소 */
    private String vegetable;

    /* 설명. 선택된 패티 */
    private String patty;

    /* 설명. 선택된 소스 */
    private String source;
}
