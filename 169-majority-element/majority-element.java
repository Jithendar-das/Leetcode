class Solution {
    public int majorityElement(int[] nums) {

        int el = nums[0];
        int count=0;

        for(int num : nums)
        {
            if(count == 0)
            {
                el = num;
            }
            if(el == num)
            {
                count++;
            }
            else{
                count--;
            }
        }

        int count1 =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == el)
            {
                count1++;
            }
        }
        if(count1 > nums.length/2)
        {
            return el;
        }

        return -1;



        
    }
}