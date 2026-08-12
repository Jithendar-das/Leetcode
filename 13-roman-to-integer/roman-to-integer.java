class Solution {
    public int romanToInt(String s) {

        

        char[] ch = s.toCharArray();

        int result=0;

        for(int i=0;i<s.length()-1;i++)
        {
            int currentvalue = getvalue(ch[i]);
            int nextvalue = getvalue(ch[i+1]);

            if(currentvalue>=nextvalue)
            {
                result += currentvalue;
            }
            if(currentvalue<nextvalue)
            {
                result -= currentvalue;
            }

            
        }

        result = result+getvalue(ch[s.length()-1]);

        return result;
       

        
        
    }

    private int getvalue(char ch)
    {
        switch(ch)
        {
            case 'I': return 1; 
            case 'V': return 5; 
            case 'X': return 10; 
            case 'L': return 50; 
            case 'C': return 100; 
            case 'D': return 500; 
            case 'M': return 1000;

            default: return 0; 
        }
    }
}