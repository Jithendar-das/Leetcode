class Solution {
    public int maxProduct(int[] nums) {

        int cmax = nums[0];
        int cmin = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int curr = nums[i];

            if(curr < 0)
            {
                int temp = cmax;
                cmax = cmin;
                cmin = temp;
            }

            cmax = Math.max(curr,cmax*curr);
            cmin = Math.min(curr,cmin*curr);

            result = Math.max(result,cmax);
        }

        return result;
    }
}