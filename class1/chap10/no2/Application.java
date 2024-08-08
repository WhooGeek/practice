package com.whoo.chap10.no2;

import com.whoo.chap10.no2.dateException;
import com.whoo.chap10.no2.ageException;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {


        try{
            Scanner sc = new Scanner(System.in);
            no2Exception exception = new no2Exception();
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String a = sc.nextLine();
            exception.checkhuman(a);
            System.out.println("입장하셔도 됩니다.");

        }catch(dateException e){
            System.out.println(e.getMessage());

        }catch(ageException e) {
            System.out.println(e.getMessage());
        }

    }


    /* ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
     *
     * ----- 출력 예시 -----
     *
     * 만 20세 미만은 입장 불가입니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
     *
     * ----- 출력 예시 -----
     *
     * 입장하셔도 됩니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
     *
     * ----- 출력 예시 -----
     *
     * 날짜 양식을 잘못 입력하셨습니다.
     */
}
