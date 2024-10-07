public class autoconvert{
	public static void main(String[] args){
		int num='a';
		double d1=80;
		System.out.println(num);
		System.out.println(d1);
		//多种类型混合运算时，自动转换成最大的类型再计算，计算时注意
		int n1=10;
		// float d1=n1+1.1;
		double d2=n1+1.1;
		float d3=n1+1.1f;

		//int n2=1.1;

		byte b1=10;
		// int n2=1;
		// byte b2=n2;

		byte b2=1;
		short s1=1;
		int s2=b2+s1;
		//byte b4=b2+b2
	}
}