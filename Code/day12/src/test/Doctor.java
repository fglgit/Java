package test;

public class Doctor {
    public static void main(String[] args) {
        Doc doc1 = new Doc("jack", 20, "cure", '男', 9000);
        Doc doc2 = new Doc("jack", 20, "cure", '男', 9000);
        System.out.println(doc1.equals(doc2));
        System.out.println(doc1==doc2);
    }
}
class Doc{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doc(String name,int age,String job,char gender,double sal){
        this.name=name;
        this.age=age;
        this.job=job;
        this.gender=gender;
        this.sal=sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        //先判断是否相同
        if(obj instanceof Doc){
            Doc doc=(Doc)obj;
           return (doc.getName().equals(name)) && (doc.getAge()==this.age)&&(doc.getJob().equals(job))&&(doc.getGender()==this.gender)&&(doc.getSal()==this.sal);
        }else {
            return false;
        }
        //再判断obj是否为Do c类型或其子类
    }

}