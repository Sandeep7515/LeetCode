class Solution {
    public int removeElement(int[] nums, int val)
    {
        int k=0;
        int m=nums.length;
        for(int i=0;i<m;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}