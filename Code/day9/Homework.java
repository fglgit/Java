import java.util.Scanner;
public class Homework{
	public static void main(String[] args){
		work w=new work();
		double[] arr1=null;
		double[] arr2={};
		double[] arr3={1,2,3.14,2.5,61,251.25};
		Double res=w.max(arr3);
		if(res!=null){
			System.out.println("���ֵΪ��"+res);
		}else{
			System.out.println("�����������鲻��Ϊnull��{}");
		}
		w.game();
	}
}
class work{
	String name;
	int price;
	//null���Ը�ֵ��Double
	public Double max(double[] arr){
		//���뽡׳�ԣ�����Ϊ�գ�����Ϊnull
		if(arr!=null&&arr.length>0){
			double maxNumber=arr[0];
			for(int i=0;i<arr.length;i++){
				arr[0]=Math.max(arr[0],arr[i]);
			}
			return arr[0];
		}
		return null;
	}
	// public work(Strint name,int price){
	// 	this.name=name;
	// 	this.price=price;
	// }
	public int[] copyArr(int[] oldArr){
		int[] arr=new int[oldArr.length];
		for(int i=0;i<oldArr.length;i++){
			arr[i]=oldArr[i];
		}
		return arr;
	}
	public void game(){
		Scanner myScanner=new Scanner(System.in);
		for(int i=0;i<3;i++){
			int a=(int)(Math.random()*10)/3;
			int b=myScanner.nextInt();
			System.out.println("A="+a+" B="+b);
			if(a==b){
				System.out.println("ƽ��");
			}else if(a-b+((a-b)<0?3:0)==2){
				System.out.println("A��ʤ");
			}else{
				System.out.println("B��ʤ");
			}
		}
	}
}