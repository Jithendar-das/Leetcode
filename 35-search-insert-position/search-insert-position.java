class Solution {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;

        for(int k=0;k<nums.length;k++)
        {
            if(nums[k] == target)
            {
                return k;
            }
        }
        if(target < nums[0])
        {
            return 0;
        }
        if(target > nums[nums.length-1])
        {
            return nums.length;
        }

        while(i<j)
        {
            if(nums[i] < target && target < nums[i+1])
            {
                return i+1;
            }
            if(nums[j] > target && target > nums[j-1])
            {
                return j;
            }
            i++;
            j--;
        }

        return -1;
        
    }
}