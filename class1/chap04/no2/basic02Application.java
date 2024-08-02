package practice.class1.chap04.no2;

public class basic02Application {
    public static void main(String[] args) {
        int sum1 = 0;
        for(int i = 0; i <= 10; i ++){
            sum1 += i;
        }
        System.out.println("1부터 10까지의 합 :" + sum1);
    }
    /* 1부터 10까지 합계를 구하고 결과를 출력하세요
     *
     * -- 출력 예시 --
     * 1부터 10까지의 합 : 55
     * */
}
