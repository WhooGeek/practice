package com.whoo.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        int random = (int) (Math.random() * max-min) + min;
        System.out.println(random);
        return random;
    }

    public static String randomUpperAlpabet(int lenghth){
            int random = 0;
        for (int i = 0; i < lenghth; i++){
            random = (int) (Math.random() * (122-97)) + 97;
            System.out.print((char)random);
        }
        System.out.println();
        return String.valueOf(random);
    }

    public static String rockPaperScissors(){
        String result2;
        if (Math.random() < 0.6){
            result2 = "가위";
            System.out.println("가위");
        }else if (Math.random() < 0.3) {
            result2 = "바위";
            System.out.println("바위");
        }else{
            result2 = "보";
            System.out.println("보");
        }
        return result2;

    }

    public static String tossCoin(){

        String result1;
        if (Math.random() < 0.5){
            result1 = "앞면";
            System.out.println(result1);
        }else{
            result1 = "뒷면";
            System.out.println(result1);
        }
        return result1;

    }

}
