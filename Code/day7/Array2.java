import java.util.Scanner;
public class Array2{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		char[] chars=new char[26];
		for(int i=0;i<chars.length;i++){
			chars[i]=(char)('A'+i);
		}
		for(int i=0;i<chars.length;i++){
			System.out.print(chars[i]);
		}
	}	
}