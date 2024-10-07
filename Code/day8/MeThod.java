import java.util.Scanner;
public class MeThod{
	public static void main(String[] args){
 		Person p=new Person();
 		p.name="髋关节";
 		p.age=80;
 		System.out.println("我是"+p.name);
 		System.out.println("我"+p.age+"岁了");
 		p.speak();
 		p.cal01();

 		Scanner myScanner=new Scanner(System.in);
 		p.cal02(myScanner.nextInt());
 		System.out.println(p.getSum(myScanner.nextInt(),myScanner.nextInt()));
	}
}

class Person{
	//属性
	String name;
	int age;
	//方法
	//1.public 	表示方法是公开
	//2.void	表示方法没有返回值
	//3.speak()	方法名和形参列表
	//4.{}		方法体
	public void speak(){
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int res=0;
		for(int i=1;i<=1000;i++){
			res+=i;
		}
		System.out.println("1+2+...+1000的计算结果："+res);
	}
	public void cal02(int n){
		int res=0;
		for(int i=1;i<=n;i++){
			res+=i;
		}
		System.out.println("1+2+...+"+n+"的计算结果："+res);
	}
	public int getSum(int num1,int num2){
		return num1+num2;
	}
}