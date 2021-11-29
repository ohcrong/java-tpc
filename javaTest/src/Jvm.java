public class Jvm {
    public static void main(String[] args) throws Exception {
        //JVM 구조 - static이 붙어있는 메서드 -> METHOD AREA, static zone
        //변수 c,d, sum은 STACK AREA
        //main(), addStatic()은 METHOD AREA
        //STACK AREA, pc 첫번째는 main() 실행
        int c = 1;
        int d = 4;
        //STACK AREA, pc 두번째로 addStatic() 실행 후 아웃 LIFO
        int sum = addStatic(c, d);
        System.out.println(sum);

        //JVM 구조 - HEAP AREA
        int a = 2;
        int b = 3;
        
        //객체 생성 -> HEAP AREA
        Jvm jvm = new Jvm();

        //STACK AREA의 변수 jvm -> 
        //HEAP AREA의 add -> (pointer)
        //METHOD AREA, non-static zone의 add() 참조
        //STACK AREA, pc 추가된 후 실행 
        int result = jvm.add(a, b);
        System.out.println(result);
    }
    public static int addStatic(int x, int y) {
        int sum = x + y;
        return sum;
    }
    
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
