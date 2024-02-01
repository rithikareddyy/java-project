package functionalInterfaces;

import java.util.*;
public  class Factorial
{
    public static int FindFactorial (int n)
    {
        int i=2,fact=1;
        if(n==0||n==1)
            return 1;
        else{
            while(i<=n)
            {
                fact=fact*i;
                i++;
            }
            return fact;
        }

    }
}
