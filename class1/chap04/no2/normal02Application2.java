package practice.class1.chap04.no2;

public class normal02Application2 {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<a.length(); i++){
            System.out.print(a.charAt(i));
        }
    }
    /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
     *
     * -- 출력 예시 --
     * abcdefghijklmnopqrstuvwxyz
     * */
}
