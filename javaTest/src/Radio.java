public class Radio implements RemoteControl{
    
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
        System.out.println("Can not use Netflix on this device");
    }
}
