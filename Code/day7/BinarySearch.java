import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args){
		int[] arr={1,2,5,6,7,9,12,15,19,21,25};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("��");
		for(int i=0;i<arr.length;i++){
			System.out.print(i+"\t");
		}
		System.out.println("��");

		System.out.println("��������Ҫ���ֲ��ҵ�Ԫ��");
		Scanner myScanner=new Scanner(System.in);
		int n=myScanner.nextInt();
		int left=0,right=arr.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==n){
				System.out.println("Ԫ��"+n+"�ǵ�"+(mid+1)+"��Ԫ��");
				break;
			}
			else if(arr[mid]<n){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
	}
}