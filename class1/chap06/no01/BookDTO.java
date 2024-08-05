package com.whoo.chap06.no01;

public class BookDTO {
    private String title;
    private String pulisher;
    private String author;
    private int pricd;
    private double discountRate;

    public BookDTO() {}

    public BookDTO(String title, String pulisher, String author){
        this.title = title;
        this.pulisher = pulisher;
        this.author = author;
    }

    public BookDTO(String title, String pulisher, String author, int pricd, double discountRate){
        this.title = title;
        this.pulisher = pulisher;
        this.author = author;
        this.pricd = pricd;
        this.discountRate = discountRate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPricd() {
        return pricd;
    }

    public void setPricd(int pricd) {
        this.pricd = pricd;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getInformation(){
        return this.title + " " + this.pulisher + " " + this.author + " " + this.pricd + " " + this.discountRate;
    }
}
