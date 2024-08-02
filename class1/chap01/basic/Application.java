package practice.class1.chap01.basic;
import practice.class1.chap01.basic.Calculator;
public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethod();
        cal.sum1to10();
        cal.checkMaxNumber(10, 20);
        cal.sumTwoNumber(10, 20);
        cal.minusTwoNumber(10, 5);
    }
}
