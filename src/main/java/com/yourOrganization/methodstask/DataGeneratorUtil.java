package com.yourOrganization.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int getRandomInt (int min, int max){
        if(min >= max){
            System.out.println("error: Valoarea min trebuie sa fie mai mica ca valoarea max.");
            return -1;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        return deltaRandomInt + min;
    }

    public static int getRandomInt(int limit){
        return random.nextInt(limit);
    }

    public static double getRandomDouble(double limit){
        if(limit <=0){
            System.out.println("error: Limita trebuie sa fie mai mare de zero.");
            return -1;
        }
        return random.nextDouble() * limit;
    }

    public static boolean getRandomBoolean(){
        return random.nextBoolean();
    }

    public static String getRandomEmail(){
        String uuid = UUID.randomUUID().toString();
        String domain = "@mailinator.com";
        return uuid + domain;
    }

    public static String generateValidRandomString (int length){
        String acceptedChars = "^A-Za-z0-9";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++ ){
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("in iteratia : i = " + i +
                    " caracter alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    public static String generateInvalidRandomString(int length){
        String acceptedChars = "#$%&'''()+,-./:;<=>?@[]^_`{|}~";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++ ){
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("in iteratia : i = " + i +
                    " caracter alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}
