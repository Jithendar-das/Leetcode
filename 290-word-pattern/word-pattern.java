class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] word = s.split(" ");

        if(pattern.length() != word.length)
        {
            return false;
        }

        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            char c1 = pattern.charAt(i);
            String w = word[i];

            if(map1.containsKey(c1) && !map1.get(c1).equals(w))
            {
                return false;
            }
            if(map2.containsKey(w) && !map2.get(w).equals(c1))
            {
                return false;
            }

            map1.put(c1,w);
            map2.put(w,c1);


        }

        return true;        
        
    }
}