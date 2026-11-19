class Solution {
    public String removeDigit(String number, char digit) {

        int n = number.length();

        // String result = "";

        for(int i=1;i<n;i++)
        {
            if(number.charAt(i-1) == digit)
            {
                if(number.charAt(i-1) < number.charAt(i))
                {
                    return number.substring(0,i-1) + number.substring(i);
                }
        
            }
        
        }

        int index = number.lastIndexOf(digit);


        
    return number.substring(0,index) + number.substring(index+1);
    }

}