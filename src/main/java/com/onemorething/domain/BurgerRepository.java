package com.onemorething.domain;

import com.onemorething.application.BurgerService;
import com.onemorething.common.BurgerDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("burgerDAO")
public class BurgerRepository { //DB

    private final Map<Integer, BurgerDTO> bugerList;

    public BurgerRepository() {
        this.bugerList = new HashMap<>();

        bugerList.put(1, new BurgerDTO(1, "참깨귀뚜라미레전드버거", "침깨빵", "양상추", "바베큐", "귀뚜라미튀김"));
        bugerList.put(2, new BurgerDTO(2, "민초귀뚜라미버거", "침깨빵", "양상추", "민초", "귀뚜라미튀김"));
        bugerList.put(3, new BurgerDTO(3, "바베큐불고기버거", "침깨빵", "양상추", "바베큐", "비프"));
        bugerList.put(4, new BurgerDTO(4, "민초불고기버거", "침깨빵", "양상추", "민초", "비프"));
        bugerList.put(5, new BurgerDTO(5, "불지옥귀뚜라미버거", "침깨빵", "페페론치노", "바베큐", "귀뚜라미튀김"));
        bugerList.put(6, new BurgerDTO(6, "불지옥민초귀뚜라미버거", "침깨빵", "페페론치노", "민초", "귀뚜라미튀김"));
        bugerList.put(7, new BurgerDTO(7, "레전드불진호버거", "침깨빵", "페페론치노", "바베큐", "비프"));
        bugerList.put(8, new BurgerDTO(8, "불지옥민초버거", "침깨빵", "페페론치노", "민초", "비프"));
        bugerList.put(9, new BurgerDTO(9, "귀뚜라미꽃빵버거", "꽃빵", "양상추", "바베큐", "귀뚜라미튀김"));
        bugerList.put(10, new BurgerDTO(10, "민초에빠진귀뚜라미버거", "꽃빵", "양상추", "민초", "귀뚜라미튀김"));
        bugerList.put(11, new BurgerDTO(11, "꽃빵불고기버거", "꽃빵", "양상추", "바베큐", "비프"));
        bugerList.put(12, new BurgerDTO(12, "꽃빵민초버거", "꽃빵", "양상추", "민초", "비프"));
        bugerList.put(13, new BurgerDTO(13, "꽃빵불지옥귀뚜라미버거", "꽃빵", "페페론치노", "바베큐", "귀뚜라미튀김"));
        bugerList.put(14, new BurgerDTO(14, "불지옥귀뚜라미에빠진꽃민초버거", "꽃빵", "페페론치노", "민초", "귀뚜라미튀김"));
        bugerList.put(15, new BurgerDTO(15, "불지옥꽃빵버거", "꽃빵", "페페론치노", "바베큐", "비프"));
        bugerList.put(16, new BurgerDTO(16, "불지옥민초버거", "꽃빵", "페페론치노", "민초", "비프"));
    }


    public BurgerDTO findRandomSource(String source) {

        return bugerList.get(source);
    }
}