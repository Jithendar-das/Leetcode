import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m+n];

        int index=0;
        for(int i=0;i<m;i++)
        {
            temp[index++] = nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            temp[index++] = nums2[i];
        }

        System.arraycopy(temp,0,nums1,0,nums1.length);

        Arrays.sort(nums1);


        
        // // int[] L = new int[m+n];
        // // int[] R = new int[n];

        // // for(int i=0;i<m+n;i++)
        // // {
        // //     L[i]=nums1[i];
        // // }
        // // for(int j=0;j<n;j++)
        // // {
        // //     R[j]=nums2[j];
        // // }

    

        // int i=m-1;
        // int j=n-1;
        // int k=m+n-1;

        // while(i>=0 && j>=0)
        // {
        //     if(nums1[i]>nums2[j])
        //     {
        //         nums1[k]=nums1[i];
        //         i--;
        //     }
        //     else
        //     {
        //         nums1[k]=nums2[j];
        //         j--;
        //     }
        //     k--;

        // }

        // while(j>=0)
        // {
        //     nums1[k]=nums2[j];
        //     j--;
        //     k--;
        // }
        // // while(j>=0)
        // // {
        // //     nums1[k]=nums2[j];
        // //     j--;
        // //     k--;
        // // }

        


    }
}