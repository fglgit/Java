public class test{
	public static void main(String[] args) {
		int[] nums1={2,6,4};
		int[] nums2={9,7,5};
        int Min1=-1;
        int Min2=-1;
        for(int i=0;i<nums1.length;i++){
            Min1=(Min1<nums1[i])?nums1[i]:Min1;
            System.out.println(Min1);
        }
        for(int i=0;i<nums2.length;i++){
            Min2=(Min2<nums2[i])?nums2[i]:Min2;
        }
        System.out.println(Min2-Min1);
    }
}