public class Class1{
	public static void main(String[] args){
 		Cat cat1=new Cat();
 		cat1.name="С��";
 		cat1.age=3;
 		cat1.color="��ɫ";
 		Cat cat2=new Cat();
 		cat2.name="С��";
 		cat2.age=3;
 		cat2.color="��ɫ";

 		System.out.println("��һֻè���֣�"+cat1.name+" ���䣺"+cat1.age+" ��ɫ��"+cat1.color);
	}
}

class Cat{
	//����
	String name;
	int age;
	String color;

}