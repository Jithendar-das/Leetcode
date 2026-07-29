class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i=0;
        int windowsum=0;
        int minlen=Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++)
        {
            windowsum += nums[j];

            while(windowsum >= target)
            {
                minlen=Math.min(minlen, j-i+1);
                windowsum -= nums[i];
                i++;
            }


        }
        if(minlen == Integer.MAX_VALUE)
        {
            return 0;
        }

        return minlen;
        
    }
}