import java.util.Scanner;
public class Arry1{
	public static void main(String[] args){
		double[] hens={3,5,1,3.4,2,50};
		for(int i=0;i<6;i++){
			System.out.println("��"+(i+1)+"��Ԫ�أ�"+hens[i]);
		}
		System.out.println("���鳤��Ϊ��"+hens.length);

		System.out.println("��һ������5������");
		double[] scores=new double[5];
		Scanner myScanner=new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			scores[i]=myScanner.nextDouble();
		}
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[i]+"\t");
		}
	}
}