import java.util.Scanner;
public class Arry1{
	public static void main(String[] args){
		double[] hens={3,5,1,3.4,2,50};
		for(int i=0;i<6;i++){
			System.out.println("第"+(i+1)+"个元素："+hens[i]);
		}
		System.out.println("数组长度为："+hens.length);

		System.out.println("请一次输入5个分数");
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