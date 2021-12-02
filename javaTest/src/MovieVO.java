public class MovieVO {

    //constructor overloading 생성자 중복정의 -> 생성 + 초기화
    //new MovieVO();
    //new MovieVO(title, runTime, director);
    //객체지향에서는 메서드 이름이 같아도 에러x
    private String title;
    private int runTime;
    private String director;

    public MovieVO(){
        
    }

    public MovieVO(String title, int runTime, String director) {
        this.title = title;
        this.runTime = runTime;
        this.director = director;
    }
    
}
