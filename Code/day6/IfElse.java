import java.util.Scanner;
public class IfElse{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		int age =myScanner.nextInt();
		if(age>18)
			System.out.println("���Ѿ�������");
		
		if(age>18){
			System.out.println("����������18");
		}
		else if(age>0){
			System.out.println("�������С�ڵ���18������0");
		}
		else{
			System.out.println("�����ҳ�");
		}

		int year=myScanner.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println(year+"��������");
		}else{
			System.out.println(year+"�겻������");
		}
	}
	
}