public class ternaryoperator{
	public static void main(String[] args){
		int a=10;
		int b=99;
		int result=a>b?a++:--b;
		System.out.println(result);

		int n1=55;
		int n2=33;
		int n3=123;
		int n4;
		n4=n1>n2?n1:n2;
		System.out.println(n4>n3?n4:n3);
	}
}