public class TestDTO {
    
    private String name;
    private int age;
    private String city;

    //default constructor
    public TestDTO(){
        super();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
}
