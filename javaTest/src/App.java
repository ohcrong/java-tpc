public class App {
    public static void main(String[] args) throws Exception {
        //직접이용
        Football football = new Football();
        
        //간접이용 , UPCASTING
        Sport sport = new Football();
        sport.play();

        //DOWNCASTING
        ((Football)sport).cornerKick();
    }
}
