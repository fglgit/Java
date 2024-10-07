public class forceconvert{
	public static void main(String[] args){
			int i=(int)1.9;
			System.out.println("i=" + i);

			int j=2000;
			byte b1=(byte)j;
			System.out.println("b1=" + b1);


			//int x=(int)10*3.5+6*1.5;
			int x=(int)(10*3.5+6*1.5);
			System.out.println("x=" + x);	

			char c1=100;
			int m=100;
			//char c2=m;
			char c3=(char)m;
			System.out.println(c3);
	}
}