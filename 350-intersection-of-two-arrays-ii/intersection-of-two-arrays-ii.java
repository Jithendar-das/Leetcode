class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int k=0;
        int[] nums3 = new int[Math.min(nums1.length,nums2.length)];
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums2)
        {
           if( map.getOrDefault(num,0) > 0)
           {
            nums3[k++] = num;
            map.put(num,map.getOrDefault(num,0) -1); 
           }
        }

        return Arrays.copyOf(nums3,k);
        
    }
}