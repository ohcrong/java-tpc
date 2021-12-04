public class App {
    public static void main(String[] args) throws Exception {
        MethodOverloadingVO mo = new MethodOverloadingVO();
        int a = 1;
        int b = 2;
        float c = 1.2f;
        float d = 3.4f;

        mo.add(a, b);
        mo.add(c, b);
        mo.add(c, d);
    }
}
