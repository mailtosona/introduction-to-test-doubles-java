package com.techreturners.bubbleteaordersystem.service;

import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import java.util.Random;

public class BubbleTeaRouletteService {

    private final Random RANDOM;
    private final int SIZE = BubbleTeaTypeEnum.values().length;

    public BubbleTeaRouletteService(Random random) {
        this.RANDOM = random;
    }


    public BubbleTeaTypeEnum getRandomBubbleTeaType() {Random random = new Random();return BubbleTeaTypeEnum.values()[random.nextInt(SIZE)];
    }

}
