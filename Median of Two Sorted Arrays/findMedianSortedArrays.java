import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int nums1_size=nums1.length;
        int nums2_size=nums2.length;
        int[] arr=new int[nums1_size+nums2_size];
        for(int m=0;m<nums1_size;m++)
        {
            arr[m]=nums1[m];
        }
        for(int p=0;p<nums2_size;p++)
        {
                arr[nums1_size+p]=nums2[p];
        }
        Arrays.sort(arr); 
         int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }
    }

}