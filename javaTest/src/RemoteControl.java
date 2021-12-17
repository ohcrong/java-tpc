public interface RemoteControl {

    public static final int MAXCH = 100;
    int MINCH = 0; 

    public int chUp();
    public int chDown();
    public void logInToNetflix();
}
