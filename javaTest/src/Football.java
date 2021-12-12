public class Football extends Sport {
    
    @Override
    public void play() {
        System.out.println("play first half");
    }

    public void cornerKick() {
        System.out.println("ready for header");
    }

    public Football() { }
}
