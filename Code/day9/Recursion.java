public class Recursion{
	public static void main(String[] args){
		int n=10;
		RecExample r=new RecExample();
		r.test(n);
		System.out.println(n+"!="+r.factorial0(n));
		System.out.println(n+"!="+r.factorial1(n));
		System.out.println("Fibonacci("+n+")="+r.fibonacci(n));
		System.out.println("monkeyPeach("+n+")="+r.monkeyPeach(n));
		int[][] map={{1,1,1,1,1,1,1},{1,0,0,0,0,0,1},{1,0,0,0,0,0,1},{1,1,1,0,0,0,1},{1,0,0,0,0,0,1},{1,0,0,0,0,0,1},{1,0,0,0,0,0,1},{1,1,1,1,1,1,1}};
		int i=1;
		int j=1;
		System.out.println(r.findway(map,i,j));
		r.hanoi(3,'A','B','C');
		int[] chess=new int[8];
		for(int I=0;I<8;I++){
			chess[I]=-1;
		}
		System.out.println("八皇后解的个数为"+r.eightQueen(chess,0));
	}
}
class RecExample{
	public void test(int n){
		if(n>=2){
			test(n-1);
		}
		System.out.println("n="+n);
	}
	public int factorial0(int n){
		if(n>=2){
			return factorial0(n-1)*n;
		}
		else{
			return 1;
		}
	}
	public int factorial1(int n){
		if(n==1){
			return 1;
		}
		else{
			return factorial1(n-1)*n;
		}
	}
	public int fibonacci(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public int monkeyPeach(int n){
		if(n==1){
			return 1;
		}else{
			return 2*monkeyPeach(n-1)+1;	
		}
	}
	public boolean findway(int[][] map,int i,int j){
		if(map[i][j]!=0)
			return false;
		map[i][j]=2;
		if(i==6&&j==5)
			return true;
		
		if(i+1<map.length&&findway(map,i+1,j)){
			return true;
		}
		if(i-1>=0&&findway(map,i-1,j)){
			return true;
		}
		if(j+1<map[0].length&&findway(map,i,j+1)){
			return true;
		}
		if(j-1>=0&&findway(map,i,j-1)){
			return true;
		}
		return false;
	}
	//num表示要移动的个数，具体表示为num个盘子从a经过b移动到c
	public void hanoi(int num,char a,char b,char c){
		if(num==1){
			System.out.println(a+"->"+c);
		}else{
			//把除最底下的的盘子从a移动到b
			hanoi(num-1,a,c,b);
			//把最底下的盘子直接从a移动到c
			System.out.println(a+"->"+c);
			//把b中的num-1个盘子从b移动到c
			hanoi(num-1,b,a,c);
		}
	}
	public int eightQueen(int[] arr,int j){
		int sum=0;
		if(j==8){
			return 1;
		}
		for(int i=0;i<8;i++){
			boolean canlay=true;
			for(int k=0;k<j;k++){
				if(arr[k]==i||arr[k]+j-k==i||arr[k]+k-j==i){
					canlay=false;
					break;
				}
			}
			if(canlay){
				arr[j]=i;
				sum+=eightQueen(arr,j+1);
				arr[j]=-1;
			}
		}
		return sum;
	}
}