package com.onemorething.domain.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BurgerEntity { //DB에 넣을것 파싱

//    private static BurgerEntity entity = new BurgerEntity();

    private int sequence;
    private String bread;
    private String vegetable;
    private String patty;
    private String source;
    private int price;

//    public static BurgerEntity getBurgerEntity() {
//        return entity;
//    }
}

/*
* # 최종 레시피 버거 이름
- 참깨빵, 양상추, 귀뚜라미튀김, 바베큐 - 참깨귀뚜라미레전드버거 - 7000원
- 참깨빵, 양상추, 귀뚜라미튀김, 민초 - 민초귀뚜라미버거 - 7300원
- 참깨빵, 양상추, 비프, 바베큐 - 바베큐불고기버거 - 7500원
- 참깨빵, 양상추, 비프, 민초 - 민초불고기버거 - 7800원
- 참깨빵, 페페론치노, 귀뚜라미튀김, 바베큐 - 불지옥귀뚜라미버거 - 7200원
- 참깨빵, 페페론치노, 귀뚜라미튀김, 민초 - 불지옥민초귀뚜라미버거 - 7500원
- 참깨빵, 페페론치노, 비프, 바베큐 - 레전드불진호버거 - 7700원
- 참깨빵, 페페론치노, 비프, 민초 - 불지옥민초버거 - 8000원
- 꽃빵, 양상추, 귀뚜라미튀김, 바베큐 - 귀뚜라미꽃빵버거 - 7000원
- 꽃빵, 양상추, 귀뚜라미튀김, 민초 - 민초에빠진귀뚜라미버거 - 7300원
- 꽃빵, 양상추, 비프, 바베큐 - 꽃빵불고기버거 - 7500원
- 꽃빵, 양상추, 비프, 민초 - 꽃빵민초버거 - 7800원
- 꽃빵, 페페론치노, 귀뚜라미튀김, 바베큐 - 불지옥귀뚜라미에빠진꽃민초버거 - 8000원
- 꽃빵, 페페론치노, 비프, 바베큐 - 불지옥꽃빵버거 - 7700원
- 꽃빵, 페페론치노, 비프, 민초 - 불지옥민초버거 - 8000원
*
* 야채 양상추 1500 페퍼론치노 1700
* 빵  참깨빵 2000 꽃빵 2000
* 패티 귀뚜라미튀김 3000 비프 3500
* 소스 바베큐 500 민초 800
*
* */