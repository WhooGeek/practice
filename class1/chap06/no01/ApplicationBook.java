package com.whoo.chap06.no01;

public class ApplicationBook {
    public static void main(String[] args) {
        BookDTO book = new BookDTO();
        System.out.println(book.getTitle());
        System.out.println(book.getPulisher());
        System.out.println(book.getAuthor());
        System.out.println(book.getPricd());
        System.out.println(book.getDiscountRate());


        book.setTitle("자바의 정석");
        book.setPulisher("도우출판");
        book.setAuthor("남궁성");
        book.setPricd(0);
        book.setDiscountRate(0.0);

        System.out.println(book.getTitle());
        System.out.println(book.getPulisher());
        System.out.println(book.getAuthor());
        System.out.println(book.getPricd());
        System.out.println(book.getDiscountRate());

        book.setTitle("홍길동전");
        book.setPulisher("활빈당");
        book.setAuthor("허균");
        book.setPricd(5000000);
        book.setDiscountRate(0.5);

        System.out.println(book.getTitle());
        System.out.println(book.getPulisher());
        System.out.println(book.getAuthor());
        System.out.println(book.getPricd());
        System.out.println(book.getDiscountRate());


    }
}
