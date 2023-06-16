package com.onemorething.application.service;

import com.onemorething.common.BurgerDTO;
import com.onemorething.domain.entity.BurgerEntity;
import com.onemorething.domain.repository.BurgerRepository;
import com.onemorething.infra.db.BurgerDB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BurgerService {
    /*
    로직 전송, 결과
    엔티티 파싱, 결과
    레포지토리 전송
     */

    private BurgerEntity burgerEntity;
//
//    BurgerDB burgerDB = new BurgerDB();
    public String makeBurger(BurgerDTO result) {

        Random random = new Random();
        int randomSequence = random.nextInt();

        burgerEntity.setSequence(randomSequence);

        System.out.println(result + "이 BurgerService로 넘어왔습니다.");

        return null;
    }

}
