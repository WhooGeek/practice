package com.whoo.chap05.no01;

import java.util.Objects;
import java.util.Scanner;

public class advanced02 {

    public static void main(String[] args) {

        String [] arr = new String[4];
        int num = 0;
        int b = 0;
        int s = 0;
        int cnt = 10;
        // 랜덤함수 배열에 입력
        for (int i = 0; i < arr.length; i++) {
            num = (int) (Math.random()* 9);
            arr[i] = String.valueOf(num);
            for (int j = 0 ; j < i ; j++){
                if(Objects.equals(arr[i], arr[j])){
                    i--; // 중복일때 i -1 로 다시 랜덤 숫자 생성 및 검증
                }
            }
        }
        // 랜덤으로 나온 4자리수 출력 (확인용)
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
        System.out.println("");

        // while문으로 시나리오 실행
        while (true){
            System.out.println(cnt + "회 남으셨습니다.");
            System.out.println("4자리 숫자를 입력하세요");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();

            if (number.length() != 4){  // 입력받은 4자리수 문자열 길이가 4일 경우에만 다음 단계로 진행
                System.out.print("4자리수를 입력해주세요 : ");

            }else{

                String[] base = new String[4];
                for (int i = 0; i < 4; i++){  // 입력받은 4자리수 문자열 base 배열에 삽입
                    base[i] = number.charAt(i) + "";
                }

                for (int i = 0; i < 4; i++) { // 이중 for문으로 랜덤숫자 배열(arr), 입력값 배열(base)의 같은 자리수를 비교
                    if (Objects.equals(base[i], arr[i])){
                        s++;// 맞다면 스트라이크 증가
                    }
                    for(int j = 0 ; j < 4 ; j++){
                        if (Objects.equals(base[i], arr[i])){
                            // 위에서 스트라이크 증가하여 공백으로 비워둠
                        } else if (Objects.equals(base[i], arr[j])) {
                            b++; // 다른 자리에 겹치는 수가 있다면 볼 증가
                        }
                    }

                }
                if (s == 4){ //스트라이크 = 4 인 경우 정답
                    System.out.println("정답입니다.");
                    break;

                }else if (cnt == 0){ // 10번 넘으면 종료

                    System.out.println("기회를 모두 소진하셨습니다.");
                    break;
                }

                System.out.println("아쉽네요 " + s + "S " + b + "b " + "입니다."); // 맞추지 못했을때 출력 문자열
                s = 0;// 각 변수 초기화 및 카운트 변경
                b = 0;
                cnt --;
            }
        }








        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
    }
}
