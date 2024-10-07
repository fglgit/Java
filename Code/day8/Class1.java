public class Class1{
	public static void main(String[] args){
 		Cat cat1=new Cat();
 		cat1.name="小白";
 		cat1.age=3;
 		cat1.color="白色";
 		Cat cat2=new Cat();
 		cat2.name="小花";
 		cat2.age=3;
 		cat2.color="花色";

 		System.out.println("第一只猫名字："+cat1.name+" 年龄："+cat1.age+" 颜色："+cat1.color);
	}
}

class Cat{
	//属性
	String name;
	int age;
	String color;

}