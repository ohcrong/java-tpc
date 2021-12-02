public class PrivateObjectVO {
    //생성자가 private인 경우
    //객체 생성 'new'를 할 수 없다.
    private PrivateObjectVO() {

    }

    //non-static 맴버인 경우
    //객체 생성 후 사용가능하므로
    //PrivateObjectVO temp = new PrivateObjectVO() 불가
    //temp.instanceMethod() 사용 불가
    public void instanceMethod() {
        System.out.println("instance method");
    }

    //static 맴버인 경우
    //객체 생성 없이 클래스 이름으로 접근 가능
    //JVM의 Method Area, static zone에 올라감
    //PrivateObjectVO.classMethod() 사용 가능
    public static void classMethod() {
        System.out.println("class method");
    }
}
