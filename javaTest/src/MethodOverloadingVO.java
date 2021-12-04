public class MethodOverloadingVO {
    
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(float a, int b) {
        System.out.println(a+b);
    }

    public void add(float a, float b) {
        System.out.println(a+b);
    }
}
