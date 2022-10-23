class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0) return;
        int insert_pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                if(insert_pos!=i)
                {
                    nums[insert_pos]=nums[i];
                    nums[i]=0;
                }
                insert_pos++;
            }
        }
        
    }
}
