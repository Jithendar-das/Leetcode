class Solution {
    public int removeElement(int[] nums, int val) {

        int k=0;
        int i=0;
        int j=nums.length-1;

        while(i<=j)
        {
            if(nums[i] == val && nums[j] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            if(nums[i]!=val)
            {
                i++;
                k++;
            }
            if(nums[j]==val){
                j--;
            }
        }

        return k;


        
    }
}