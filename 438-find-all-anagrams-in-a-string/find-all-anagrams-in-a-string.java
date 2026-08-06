class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length())
        {
            

            return result;

        }

        int[] freq1 = new int[26];
        for(int i=0;i<p.length();i++)
        {
            freq1[p.charAt(i) - 'a']++;
        }

        int[] freq2 = new int[26];
        for(int i=0;i<p.length();i++)
        {
            freq2[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2))
        {
            result.add(0);
        }

        for(int i=p.length();i<s.length();i++)
        {
            freq2[s.charAt(i) - 'a']++;
            freq2[s.charAt(i-p.length()) - 'a']--;

            if(Arrays.equals(freq1,freq2))
            {
                result.add(i-p.length() + 1);
            }
        }

        return result;
        
    }
}