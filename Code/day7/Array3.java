public class Array3{
	public static void main(String[] args){
		int n1=2;
		int n2=n1;
		n2++;			//n2��ֵ����Ӱ��n1
		System.out.println("n1="+n1+" n2="+n2);
		
		//���鸳ֵ
		int[] arr1={1,2,3};
		int[] arr2=arr1;
		System.out.println("arr1={"+arr1[0]+","+arr1[1]+","+arr1[2]+"}");
		System.out.println("arr2={"+arr2[0]+","+arr2[1]+","+arr2[2]+"}");
		arr2[0]=4;
		System.out.println("ֻ�޸�arr2��");
		System.out.println("arr1={"+arr1[0]+","+arr1[1]+","+arr1[2]+"}");
		System.out.println("arr2={"+arr2[0]+","+arr2[1]+","+arr2[2]+"}");

		//���鿽��
		
	}	
}