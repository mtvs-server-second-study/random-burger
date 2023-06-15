package com.onemorething.application.service;

import com.onemorething.common.BurgerDTO;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {
    /*
    로직 전송, 결과
    엔티티 파싱, 결과
    레포지토리 전송
     */

    BurgerDTO dto = BurgerDTO.getDto();

    public void servicePatty() {

        String answerPatty = dto.getAnswerPatty();
        System.out.println(answerPatty + "이 servicePatty로 넘어왔습니다.");

    }

}
