package com.whoo.chap10.no2;
import com.whoo.chap10.no2.dateException;
import com.whoo.chap10.no2.ageException;

import java.time.LocalDate;

public class no2Exception {

    public void checkhuman (String str) throws dateException, ageException {
        int day = Integer.parseInt(str.substring(5,7));
        int month = Integer.parseInt(str.substring(8,10));
        int year = Integer.parseInt(str.substring(0,4));
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        //20세 미만 입장 불가능
        if(currentYear - year <= 20){
            throw new ageException("20세 미만은 입장할 수 없습니다.");
        }
        // 월이 12 이상이거나 0이하, 일이 31일 이상이거나 0이하일때
        if(month < 1 || month > 12 || day < 1 || day > 31){
            throw new dateException("날짜 양식을 잘못 입력하셨습니다.");
        }



    }
}
