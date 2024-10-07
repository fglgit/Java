import java.util.Scanner;
public class MeThod{
	public static void main(String[] args){
		int m,n;
		Scanner myScanner=new Scanner(System.in);
		m=myScanner.nextInt();
		n=myScanner.nextInt();
		AA example=new AA();
		int[] answer;
		answer=example.getSumAndSub(m,n);
		System.out.println(m+"+"+n+"="+answer[0]);
		System.out.println(m+"-"+n+"="+answer[1]);
		answer=example.getRestore(m,n);
		System.out.println(m+"+"+n+"="+answer[0]);
		System.out.println(m+"-"+n+"="+answer[1]);
		example.cilloBb();

	}
}
class AA{
	public int[] getSumAndSub(int n1,int n2){
		int[] resArr=new int[2];
		resArr[0]=n1+n2;
		resArr[1]=n1-n2;
		return resArr;
	}
	public int[] getRestore(int n1,int n2){
		int[] resArr=getSumAndSub(n1,n2);
		resArr[0]=resArr[0]+resArr[1];
		resArr[1]=resArr[0]-resArr[1];
		resArr[0]=resArr[0]-resArr[1];
		return resArr;
	}
	public void cilloBb(){
		BB b=new BB();
		b.cillo();
	}
}
class BB{
	public void cillo(){
		System.out.println("ÄãºÃ");
	}
}