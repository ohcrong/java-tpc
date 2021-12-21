public class Football extends Sport implements Ball, Team{
    
    @Override
    public void play() {
        System.out.println("play first half");
    }
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
