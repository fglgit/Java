import java.util.Scanner;
public class MeThod{
	public static void main(String[] args){
 		Person p=new Person();
 		p.name="�Źؽ�";
 		p.age=80;
 		System.out.println("����"+p.name);
 		System.out.println("��"+p.age+"����");
 		p.speak();
 		p.cal01();

 		Scanner myScanner=new Scanner(System.in);
 		p.cal02(myScanner.nextInt());
 		System.out.println(p.getSum(myScanner.nextInt(),myScanner.nextInt()));
	}
}

class Person{
	//����
	String name;
	int age;
	//����
	//1.public 	��ʾ�����ǹ���
	//2.void	��ʾ����û�з���ֵ
	//3.speak()	���������β��б�
	//4.{}		������
	public void speak(){
		System.out.println("����һ������");
	}
	public void cal01(){
		int res=0;
		for(int i=1;i<=1000;i++){
			res+=i;
		}
		System.out.println("1+2+...+1000�ļ�������"+res);
	}
	public void cal02(int n){
		int res=0;
		for(int i=1;i<=n;i++){
			res+=i;
		}
		System.out.println("1+2+...+"+n+"�ļ�������"+res);
	}
	public int getSum(int num1,int num2){
		return num1+num2;
	}
}