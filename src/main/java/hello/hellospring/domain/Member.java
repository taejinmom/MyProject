package hello.hellospring.domain;

public class Member {
    private Long id;
    private String name;
    private Grade grade;
    private int price;

    public Member(Long id, String name, Grade grade,int price) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.price = price;
    }

    public Member() { }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
