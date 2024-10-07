public class floatdetail{
	public static void main(String[] args){
		float f=1.1F;
		double d=1.1;
		double fd=1.1f;
		double num=.123;
		System.out.println(num);
		double m=3.141592653;
		float n=3.141592653f;
		System.out.println(m);
		System.out.println(n);
		double num1=2.7;
		double num2=8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		if(num1==num2){
			System.out.println("相等");
		}
		System.out.println(Math.abs(num1-num2));
		if(Math.abs(num1-num2)<0.00001){
			System.out.println("相等");
		}
	}
}