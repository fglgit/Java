public class TwoDimensionalalArray{
	public static void main(String[] args){
		int[][] arr={{1,1,1},{2,2,2},{3,3,3}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int[][] arr1=new int[2][3];
		arr1[1][1]=8;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

		int[][] arr2={{1,1,1},{8,8,9},{100}};
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}