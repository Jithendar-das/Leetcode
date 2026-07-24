class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int MaxArea = 0;

        while(i<j)
        {
            int currentHeight = Math.min(height[i],height[j]);
            int currentWidth = j-i;

            int currentArea = currentHeight * currentWidth;

            MaxArea = Math.max(MaxArea,currentArea);

            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return MaxArea;
    }
}