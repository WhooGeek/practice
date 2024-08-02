package practice.class1.chap03.normal;
import static practice.class1.chap03.normal.RandomMaker.randomNumber;
import static practice.class1.chap03.normal.RandomMaker.randomUpperAlpabet;
import static practice.class1.chap03.normal.RandomMaker.rockPaperScissors;
import static practice.class1.chap03.normal.RandomMaker.tossCoin;

public class Application {

    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();


        RandomMaker.randomUpperAlpabet(10);
        RandomMaker.randomNumber(10, 20);
        RandomMaker.rockPaperScissors();
        RandomMaker.tossCoin();
    }


}
