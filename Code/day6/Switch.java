import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		System.out.println("������һ���ַ�(a-h)");
		Scanner myScanner=new Scanner(System.in);
		char input=myScanner.next().charAt(0);
		switch(input){
		case 'a':
			System.out.println("����һ");
			break;
		case 'b':
			System.out.println("���ڶ�");
			break;
		case 'c':
			System.out.println("������");
			break;
		case 'd':
			System.out.println("����һ");
			break;
		case 'e':
			System.out.println("������");
			break;
		case 'f':
			System.out.println("������");
			break;
		case 'g':
			System.out.println("������");
			break;	
		case 'h':
			System.out.println("������");
			break;
		default:
			System.out.println("�������");
		}

		// û��break���
		// switch(input){
		// case 'a':
		// 	System.out.println("����һ");
		// case 'b':
		// 	System.out.println("���ڶ�");
		// case 'c':
		// 	System.out.println("������");
		// case 'd':
		// 	System.out.println("����һ");
		// case 'e':
		// 	System.out.println("������");
		// case 'f':
		// 	System.out.println("������");
		// case 'g':
		// 	System.out.println("������");
		// case 'h':
		// 	System.out.println("������");
		// default:
		// 	System.out.println("�������");
		double score=myScanner.nextDouble();
		int sco=(int)score/60;
		switch(sco){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("������");
			break;
		default:
			System.out.println("��������");

	
		}
			int month=myScanner.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("���Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("���Ƕ���");
			break;

		}	
		
	}
	
}