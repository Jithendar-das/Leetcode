import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        
        // Arrays.sort(nums);
        int n= nums.length;

        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=0;j<n-i-1;j++)
        //     {
        //         if(nums[j]>nums[j+1])
        //         {
        //             int temp =nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }


        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
    }
}