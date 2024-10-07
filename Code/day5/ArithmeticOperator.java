public class ArithmeticOperator{
	public static void main(String[] args){
	System.out.println("10/4="+10/4);
	System.out.println("10.0/4="+10.0/4);
	double d=10/4;
	System.out.println("d="+d);
	
	System.out.println("10%3="+10%3);
	System.out.println("-10%3="+-10%3);
	System.out.println("10%-3="+10%-3);
	System.out.println("-10%-3="+-10%-3);

	int i=10;
	int j=i++;
	System.out.println("j="+j);
	j=++i;
	System.out.println("j="+j);
	
	int ex=1;
	ex=ex++;
	System.out.println(ex);

	int exa=1;
	exa=++exa;
	System.out.println(exa);
	}
}