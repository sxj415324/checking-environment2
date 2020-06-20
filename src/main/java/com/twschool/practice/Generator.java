/*
package com.twschool.practice;

import java.util.Arrays;
import java.util.Random;

public class Generator {
    private int[] gameNum = new int[4];

    public void generateGameNum() {
        Random random = new Random();
        for(int i = 0; i<gameNum.length; i++) {
            boolean goon = true;
            int randomNum;
            do {
                int tempRandomNum = random.nextInt(10);
                long count = Arrays.stream(gameNum).filter((item) -> item == tempRandomNum).count();
                goon = count <= 0;
                randomNum = tempRandomNum;
            }while (!goon);
            gameNum[i] = randomNum;
        }
    }

    public int[] getGameNum() {
        return gameNum;
    }
}

 */

