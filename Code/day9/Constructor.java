public class Constructor{
	public static void main(String[] args){
		Person p=new Person("Smith",80);
		Person P=new Person();
		Person q=new Person("Smith");
		Person Q=new Person("Smith",18,'男');
		System.out.println("姓名："+p.name+" 年龄："+p.age);
		System.out.println("姓名："+P.name+" 年龄："+P.age);
		System.out.println("姓名："+Q.name+" 年龄："+Q.age+" 性别："+Q.gender);
		System.out.println("p的hashCode："+p.hashCode());
		System.out.print("this的hashCode：");
		p.code();
		System.out.println("p的hashCode："+q.hashCode());

	}
}
class dog{
	//dog(){}
	//默认构造器，所以new dog()就解释得通了
}
class Person{
	String name;
	int age;
	char gender;
	//构造器没有返回值，也不是void
	//构造器名称和类一样
	//形参列表和成员方法一样
	public Person(String pname,int page){
		System.out.println("构造器被调用~此时对象已经初始化了");
		name=pname;
		age=page;
	}
	public Person(String pname){
		System.out.println("构造器被调用~此时对象已经初始化了");
		name=pname;
	}
	public Person(){
		System.out.println("构造器被调用~此时对象已经初始化了");
		age=18;
	}
	public Person(String name,int age,char gender){
		System.out.println("构造器被调用~此时对象已经初始化了");
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void code(){
		System.out.println(this.hashCode());
	}
}