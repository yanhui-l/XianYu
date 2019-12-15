package com.example.Market.helper;

import java.util.Random;

/**
 * Created by hqt on 2019/12/15.
 */
public class RandomNum {
    public static String getCharAndNumr() {

        Random random = new Random();

        StringBuffer valSb = new StringBuffer();

        String charStr = "0123456789abcdefghijklmnopqrstuvwxyz";

        int charLength = charStr.length();



        for (int i = 0; i < 16; i++) {

            int index = random.nextInt(charLength);

            valSb.append(charStr.charAt(index));

        }

        return valSb.toString();

    }
}
