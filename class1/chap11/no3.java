package com.whoo.chap11;

import java.io.*;
import java.util.Scanner;

public class no3{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        String name = "";
        System.out.print("병합할 파일의 개수 입력 : ");
        int num = sc.nextInt();
        File[] file = new File[num];

        try{
            for (int i = 0; i < num; i++){
                System.out.print((i+1) + "번째 파일 이름 입력 : ");
                String filename = sc.next();
                file[i] = new File(filename);
            }

            System.out.print("병합 될 파일명 입력 : ");
            String targetname = sc.next();
            output = new BufferedOutputStream(new FileOutputStream(targetname));

            for (int i = 0; i < num; i++){
                input = new BufferedInputStream(new FileInputStream(file[i]));
                byte[] readbuffer = new byte[1024];
                int t ;
                while ((t=input.read(readbuffer)) != -1) {
                    output.write(readbuffer, 0, t);
                }

                input.close();

            }

        }catch (Exception e){
            System.out.println("오류 : " + e.getMessage());

        }finally{
            if(output != null){
                output.close();
            }

        }
    }
}
