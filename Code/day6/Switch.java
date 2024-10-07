import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		System.out.println("请输入一个字符(a-h)");
		Scanner myScanner=new Scanner(System.in);
		char input=myScanner.next().charAt(0);
		switch(input){
		case 'a':
			System.out.println("星期一");
			break;
		case 'b':
			System.out.println("星期二");
			break;
		case 'c':
			System.out.println("星期三");
			break;
		case 'd':
			System.out.println("星期一");
			break;
		case 'e':
			System.out.println("星期四");
			break;
		case 'f':
			System.out.println("星期五");
			break;
		case 'g':
			System.out.println("星期六");
			break;	
		case 'h':
			System.out.println("星期日");
			break;
		default:
			System.out.println("输入错误");
		}

		// 没有break情况
		// switch(input){
		// case 'a':
		// 	System.out.println("星期一");
		// case 'b':
		// 	System.out.println("星期二");
		// case 'c':
		// 	System.out.println("星期三");
		// case 'd':
		// 	System.out.println("星期一");
		// case 'e':
		// 	System.out.println("星期四");
		// case 'f':
		// 	System.out.println("星期五");
		// case 'g':
		// 	System.out.println("星期六");
		// case 'h':
		// 	System.out.println("星期日");
		// default:
		// 	System.out.println("输入错误");
		double score=myScanner.nextDouble();
		int sco=(int)score/60;
		switch(sco){
		case 0:
			System.out.println("不及格");
			break;
		case 1:
			System.out.println("及格了");
			break;
		default:
			System.out.println("分数错误");

	
		}
			int month=myScanner.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("这是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("这是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("这是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("这是冬季");
			break;

		}	
		
	}
	
}