import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		int n=myScanner.nextInt();
		myTool t1=new myTool();
		System.out.println(n+" «∆Ê ˝ "+t1.isOdd(n));


		Person p1=new Person();
		p1.name="¥””Í";
		p1.age=18;
		Person p2=t1.copyPerson(p1);
		System.out.println("p1.name= "+p1.name+" p1.age= "+p1.age);
		System.out.println("p2.name= "+p2.name+" p2.age= "+p2.age);
		System.out.println(p1==p2);
	}
}
class myTool{
	public boolean isOdd(int n){
	//odd 1
	//even 2
		return (n&1)==1;
	}

	public Person copyPerson(Person p){
		Person copy=new Person();
		copy.name=p.name;
		copy.age=p.age;
		return copy;
	}
}
class Person{
	String name;
	int age;
}