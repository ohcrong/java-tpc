public class App {
    public static void main(String[] args) throws Exception {
        //Override
        Sport football = new Football();
        football.play();

        //downcasting
        ((Football)football).cornerKick();
    }
}
