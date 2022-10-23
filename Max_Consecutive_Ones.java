class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count=0,final_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                current_count++;
                
            else 
            {
                final_count=Math.max(final_count,current_count);
                current_count=0;
            }
        }
        return final_count=Math.max(current_count,final_count);
        
    }
}
