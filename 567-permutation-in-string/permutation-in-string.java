class Solution {
    public boolean checkInclusion(String s1, String s2) {



        if(s1.length() > s2.length())
        {
            return false;
        }

        int[] freq1 = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            int index = c - 'a';
            freq1[index]++;
        }

        int[] freq2 = new int[26];
       

        
        for(int m=0;m<s1.length();m++)
        {
            char c = s2.charAt(m);
            int index = c - 'a';
            freq2[index]++;
            
        }
        if(Arrays.equals(freq1,freq2))
            {
                return true;
            }
        

        for(int i=s1.length();i<s2.length();i++)
        {
            
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i-s1.length()) - 'a']--;
            if(Arrays.equals(freq1,freq2))
            {
                return true;
            }
        }
            

        

        return false;
    }
}