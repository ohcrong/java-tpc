public abstract class Sport {
    //스스로 객체 생성 x, 불완전한 객체
    //하위 클래스와 같이 사용시 부모 역할을 하며 다형성 보장
    public abstract void play();

    //공통메서드
    public void move() {
        System.out.println("a player moves to win");
    }

    public Sport() { }
}
