import java.util.Scanner;
public class EzFor{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		int n=0;
		n=myScanner.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		//2n-1
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.printf(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		for(int i=1;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.printf(" ");
			}
			if(i!=1&&i!=n){
				System.out.printf("*");
				for(int j=1;j<=2*i-3;j++){
					System.out.printf(" ");
				}
				System.out.printf("*");
			}
			else{
				for(int j=1;j<=2*i-1;j++){
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
	}
}