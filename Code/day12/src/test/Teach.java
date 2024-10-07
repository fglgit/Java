package test;

public class Teach {
    public static void main(String[] args) {
        Professor teacher = new Professor("jack", 20, "teach", 9999);
        teacher.introduce();
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary){
        super(name,age,post,salary);
    }
    public void introduce(){
        System.out.println("我是"+super.getName()+"教授");
    }
}