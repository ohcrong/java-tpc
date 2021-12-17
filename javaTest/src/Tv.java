public class Tv implements RemoteControl{

    @Override
    public int chUp() {
        return +1;
    }

    @Override
    public int chDown() {
        return -1;
    }
    
    @Override
    public void logInToNetflix(){
        System.out.println("Enter your ID and password");
    }
}
