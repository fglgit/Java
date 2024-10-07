public class MeThod1{
	public static void main(String[] args){
		int[][] arr={{1,2,3},{4,5,6,7},{9,19,11,12}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		MyTools tool=new MyTools();
		tool.printArr(arr);
	}
}
class MyTools{
	public void printArr(int[][] map){
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}
}