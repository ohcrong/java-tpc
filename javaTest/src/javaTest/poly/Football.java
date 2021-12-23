package javaTest.poly;
import javaTest.poly.*;

public class Football extends Sport implements Ball, Team{
    //class 상속은 하나만 가능
    @Override
    public void play() {
        System.out.println("play first half");
    }
    //interface는 다중상속 가능하다.
    //override는 필수!
    @Override
    public void playWithBall() {
        System.out.println("play with the ball");
    }
    @Override
    public void playAsTeam() {
        System.out.println("play as team");
    }

    public void cornerKick() {
        System.out.println("ready for header");
    }

    public Football() { }
}
