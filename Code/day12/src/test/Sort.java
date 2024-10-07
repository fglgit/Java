package test;

public class Sort {
    public static void main(String[] args) {
        Person[] p=new Person[3];
        p[0]=new Person("jack",20,5000);
        p[1]=new Person("mike",17,7000);
        p[2]=new Person("jan",22,6000);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        for(int i=0;i<p.length-1;i++){
            for(int j=0;j<p.length-i-1;j++){
                if(p[j].getAge()<p[j+1].getAge()){
                    Person temp=null;
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }
}
class Person{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}