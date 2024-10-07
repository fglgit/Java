public class logicoperator{
	public static void main(String[] args){
		
		int age=50;
		if(age>20 && age<90){
			System.out.println("ok100");
		}
		if(age>20 & age<90){
			System.out.println("ok200");
		}

		int a=4;
		int b=9;
		if(a<1 &&++b<50){
			System.out.println("ok300");
		}
		System.out.println("a="+a+"\tb="+b);

		a=4;
		b=9;
		if(a<1 &++b<50){
			System.out.println("ok300");
		}
		System.out.println("a="+a+"\tb="+b);

		a=4;
		b=9;
		if(a<5 ||++b<50){
			System.out.println("ok300");
		}
		System.out.println("a="+a+"\tb="+b);
		a=4;
		b=9;
		if(a<5 |++b<50){
			System.out.println("ok300");
		}
		System.out.println("a="+a+"\tb="+b);

		System.out.println(60>20);
		System.out.println(!(60>20));
		System.out.println((60>20)^!(60>20));
	}
}