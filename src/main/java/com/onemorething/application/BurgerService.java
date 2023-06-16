package com.onemorething.application;

import com.onemorething.common.BurgerDTO;
import com.onemorething.domain.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BurgerService {

    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }

    public BurgerDTO findRandomSource(String source) {
        List<BurgerDTO> burgerList = new ArrayList<>();
        int random = new Random().nextInt(burgerList.size());
        BurgerDTO randomSource = burgerList.get(random);

        return burgerRepository.findRandomSource(source);
    }
    }

    /*
    로직 전송, 결과
    엔티티 파싱, 결과
    레포지토리 전송
     */

