public class OverLoad{
	public static void main(String[] args){
		MyCalculator C=new MyCalculator();
		C.m(10);
		C.m(10,20);
		C.m("ciallo!");
		System.out.println(C.sum(1,2,3,4,5));
		//System.out.println(C.sum({1,2,3,4,5}));
		int[] arr={1,2,3,4,5};
		System.out.println(C.sum(arr));
	}
}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1+n2;
	}
	// public int calculate(int n3,int n4){
	// 	return n1+n2;
	// }
	// public double calculate(int n1,int n2){
	// 	return n1+n2;
	// }
	public double calculate(int n1,double n2){
		return n1+n2;
	}
	public double calculate(double n1,int n2){
		return n1+n2;
	}
	public int calculate(int n1,int n2,int n3){
		return n1+n2+n3;
	}

	public void m(int n1){
		System.out.println("平方="+(n1*n1));
	}
	public void m(int n1,int n2){
		System.out.println("相乘="+(n1*n2));
	}
	public void m(String s){
		System.out.println("字符串："+s);
	}
	public double max(double n1,double n2,double n3){
		double max1=n1>n2?n1:n2;
		return max1>n3?max1:n3;
	}
	//int... 表示接受的是可变参数，即可以接收多个参数0-多
	//使用可变参数可以当作数组使用
	public int sum(int... nums){
		System.out.println("参数个数为："+nums.length);
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return sum;
	}
	public int Sum(int num1,int... nums){
		return 1;
	}
}