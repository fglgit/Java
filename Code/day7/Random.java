public class Random{
	public static void main(String[] args){
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100+1);	//1-100
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");	//1-100
		}
	}
}