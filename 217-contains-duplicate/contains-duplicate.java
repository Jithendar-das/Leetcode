import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;


        while(i<j)
        {
            if(nums[i] == nums[i+1] || nums[j] == nums[j-1])
            {
                return true;
            }
            i++;
            j--;
        }

        return false;
        
    }
}