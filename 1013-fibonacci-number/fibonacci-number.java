class Solution {
    public int fib(int n) {

        // // int m=2;
        // int sum =0;
        if(n <= 1)
        {
            return n;
        }
        // if(n == 1)
        // {
        //     return 1;
        // }

        int i=0;
        int j=1;

        for(int m=1;m<=n;m++)
        {
            
            int next = i+j;
            i=j;
            j=next;
        }

        return i;




        
    }
}