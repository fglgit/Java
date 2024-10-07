public class BinaryTest{
	public static void main(String[] args){
		int n1=0b1010;
		int n2=1010;
		int n3=01010;
		int n4=0x1010;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
		System.out.println("n4="+n4);

		System.out.println(2&3);
		System.out.println(2|3);
		System.out.println(2^3);
		System.out.println(~-2);
		System.out.println(~2);

		System.out.println(1>>2);
		System.out.println(1<<2);
		System.out.println(-1<<2);
		//-1 yuan10000001 fan11111110 bu11111111 yidong11111100 yuan10000100
		System.out.println(-10%3);
		System.out.println(-10.5%3);
		System.out.println(-10.4%3);

		int i=66;
		System.out.println(++i+i);
		String str="18.8";
		double d1=Double.parseDouble(str);
		System.out.println(str);
		char c1='º«';
		String Str=c1+"";
		System.out.println(Str);
	}
}