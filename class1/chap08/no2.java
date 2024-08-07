package com.whoo.chap08;

import java.util.Arrays;
import java.util.Scanner;

public class no2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        int[] cnt = new int[arr.length];
        int index = 1;
        int cc = 1;



        for (int i = 0; i < arr.length ; i++){
            if(arr[i] != null && arr[i].length() > 0){

                char first = arr[i].charAt(0);
                char last = arr[i].charAt(arr[i].length() - 1);

                if(!(first >= 'a' && first <= 'z') && !(first >= 'A' && first <= 'Z')){
                    arr[i] = null;
                } else if(!(last >= 'a' && last <= 'z') && !(last >= 'A' && last <= 'Z'))
                {
                    arr[i] = arr[i].substring(0, arr[i].length() - 1);

                }
            }

        }

        for(int i = 0; i < arr.length; i++){
            if( arr[i] != null){
                cnt[i] = 1;
                arr[i] = arr[i].toLowerCase();

            }
        }

        for(int i = 0; i < arr.length ; i++){
            if (arr[i] != null){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] != null && arr[i].equals(arr[j])){
                        cnt[i]++;
                        arr[j] = null;
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                System.out.println(arr[i] + " : " + cnt[i]);
            }
        }

        for(int i = 0; i< cnt.length; i++){
            if(cnt[i] > cc){
                cc = cnt[i];
                index = i;
            }
        }
        System.out.println("====== 단어 빈도 =======");
        System.out.println("가장 빈도 높은 단어 : " + arr[index] +" ("+ cnt[index] + " 번)");








    }




}
