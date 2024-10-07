import java.util.Scanner;
public class YangHui{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		int n=myScanner.nextInt();
		int[][] arr=new int[n][];
		for(int i=0;i<n;i++){
			arr[i]=new int[i+1];
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(j==0||j==arr[i].length-1){
					arr[i][j]=1;
				}else{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}

			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}