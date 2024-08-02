package practice.class1.chap01.basic;

public class Calculator {
    public static void main(String[] args) {


    }

    public void checkMethod(){
        System.out.println("함수 호출 확인");
    }

    public int sum1to10(){
        int a = 0;
        a = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println("1부터 10까지의 합 : " + a);
        return a;
    }

    public void checkMaxNumber(int num1, int num2){

        System.out.println("두 수 중 큰 수는 " + (num1 > num2 ? num1 : num2));
    }

    public int sumTwoNumber(int sum1, int sum2){

        int result1 = sum1 + sum2;
        System.out.println("10과 20의 합은 : " + result1);
        return result1;
    }

    public int minusTwoNumber(int min1, int min2){

        int result2 = min1 - min2;
        System.out.println("10과 5의 차는 : " + result2);
        return result2;
    }

}
