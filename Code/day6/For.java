import java.util.Scanner;
public class For{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			System.out.println("Java����������");
		}

		// int i=1;
		// for(;i<=10;){
		// 	System.out.println("�޵�Java����������");
		// 	i++;
		// }
		// System.out.println(i);

		int count=3;
		for(int i=0,j=0;i<count;i++,j+=2){
			System.out.println("i="+i+" j="+j);
		}


		for(int i=9;i<=100;i+=9){
			System.out.println(i);
		}

		count=0;
		do{
			System.out.println("JavaJavaJavaJava");
			count++;
		}while(count<=10);

		Scanner myScanner=new Scanner(System.in);
		char answer;
		do{
			System.out.println("��Ǯ��");
			answer=myScanner.next().charAt(0);
			if(answer=='Y')
				break;	
			else
				System.out.println("����������");
		}while(true);


		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.printf(j+"*"+i+"="+i*j+"\t");
			}
			System.out.printf("\n");
		}
	}
}