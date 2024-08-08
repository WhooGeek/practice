package com.whoo.chap11;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        String origin = "";

        try {

            System.out.println("원본 파일의 이름을 입력하세요 : ");
            origin = sc.nextLine();
            File file = new File(origin);

            if(!file.exists()){
                System.out.println("오류 : " + origin + "(지정된 파일을 찾을 수 없습니다)");
                return;
            }

            System.out.println("복사 파일의 이름을 입력하세요 : ");
            String copy = sc.nextLine();
            File newFile = new File(copy);


            input = new BufferedInputStream(new FileInputStream(file));
            output = new BufferedOutputStream(new FileOutputStream(newFile));

            byte[] readBuffer = new byte[1024];

            while ((input.read(readBuffer, 0, readBuffer.length)) > 0) {
                output.write(readBuffer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + origin + "(지정된 파일을 찾을 수 없습니다)");
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                input.close();
                output.close();
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }



        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */
    }

}
