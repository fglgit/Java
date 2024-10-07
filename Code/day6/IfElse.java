import java.util.Scanner;
public class IfElse{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		int age =myScanner.nextInt();
		if(age>18)
			System.out.println("你已经成年了");
		
		if(age>18){
			System.out.println("你的年龄大于18");
		}
		else if(age>0){
			System.out.println("你的年龄小于等于18，大于0");
		}
		else{
			System.out.println("是人我吃");
		}

		int year=myScanner.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println(year+"年是闰年");
		}else{
			System.out.println(year+"年不是闰年");
		}
	}
	
}