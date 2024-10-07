import java.util.Scanner;
public class Return{
	public static void main(String[] args){
		System.out.println("See you again");

		for(int i=100;i<=999;i++){
			int n1,n2,n3;
			n3=i%10;
			n2=i%100/10;
			n1=i/100;
			if(n1*n1*n1+n2*n2*n2+n3*n3*n3==i){
				System.out.println(i+"是水仙花数");
			}
		}

		System.out.println("请输入一个正整数n,用于计算1/1+1/2+...");
		Scanner myScanner=new Scanner(System.in);
		int n=0;
		n=myScanner.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+1.0/i;
		}
		System.out.println("1/1+1/2+...+1/"+n+"="+sum);

		System.out.println("请输入一个正整数n,用于计算1+(1+2)+(1+2+3)+...");
		n=myScanner.nextInt();
		int Sum=0;
		int dp=0;
		for(int i=1;i<=n;i++){
			dp+=i;
			Sum+=dp;
		}
		System.out.println("1+(1+2)+(1+2+3)+...="+Sum);
		
		return;
	}
}