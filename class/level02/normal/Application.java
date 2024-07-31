package com.whoo.level02.normal;
import static com.whoo.level02.normal.RandomMaker.randomNumber;
import static com.whoo.level02.normal.RandomMaker.randomUpperAlpabet;
import static com.whoo.level02.normal.RandomMaker.rockPaperScissors;
import static com.whoo.level02.normal.RandomMaker.tossCoin;

public class Application {

    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();


        RandomMaker.randomUpperAlpabet(10);
        RandomMaker.randomNumber(10, 20);
        RandomMaker.rockPaperScissors();
        RandomMaker.tossCoin();
    }


}
