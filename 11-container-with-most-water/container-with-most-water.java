class Solution {
    public int maxArea(int[] height) {

        int maxarea =0;
        int i=0;
        int j=height.length-1;

        while(i<j)
        {
            int cheight = Math.min(height[i],height[j]);
            int cwidth = j-i;
            int carea = cheight * cwidth;

            maxarea = Math.max(maxarea,carea);

            if(height[i] > height[j])
            {
                j--;
            }
            else{
                i++;
            }
        }
        return maxarea;


    }
}// int i=0;
        // int j=height.length-1;
        // int MaxArea = 0;

        // while(i<j)
        // {
        //     int currentHeight = Math.min(height[i],height[j]);
        //     int currentWidth = j-i;

        //     int currentArea = currentHeight * currentWidth;

        //     MaxArea = Math.max(MaxArea,currentArea);

        //     if(height[i]<height[j])
        //     {
        //         i++;
        //     }
        //     else
        //     {
        //         j--;
        //     }
        // }
        // return MaxArea;