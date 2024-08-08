package com.whoo.chap10.no1;

import java.util.Scanner;


public class no1Exception{

    private Scanner scan;

    public void firstCheck(String a) throws ZeroException, NumberException{

        String regExp = "^[0-9]*$";

        if(!a.matches(regExp)){
            throw new NumberException("유효한 정수를 입력하세요.");
        }
        int num1 = Integer.parseInt(a);


    }

    public void checknumber(String a, String b) throws ZeroException, NumberException{

        String regExp = "^[0-9]*$";

        if(!a.matches(regExp) || !b.matches(regExp)){
            throw new NumberException("유효한 정수를 입력하세요.");
        }

        if(b.equals("0")){
            throw new ZeroException("0으로 나누는 것은 허용되지 않습니다.");
        }

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        System.out.println("결과 : " + (num1/num2));

    }


}
