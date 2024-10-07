public class Parameter{
	public static void main(String[] args){
		int a=10;
		int b=20;
		System.out.println("a = "+a+" b = "+b);
		CC obj=new CC();
		obj.swap(a,b);
		System.out.println("a = "+a+" b = "+b);

		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+"\t");
			if((i+1)%10==0){
				System.out.println();
			}
		}
		obj.arrAbc(arr);
		System.out.println("******************************");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
			if((i+1)%10==0){
				System.out.println();
			}
		}
	}
	
}
class CC{
	public void swap(int a,int b){
		System.out.println("swap方法：");
		System.out.println("a = "+a+" b = "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a+" b = "+b);
		System.out.println("swap方法结束");
	}
	public void arrAbc(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]+=100;
		}
	}
}