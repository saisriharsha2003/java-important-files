import java.util.*;

public class isprime {
    public static boolean is_prime(int n)
    {
        boolean isitprime=true;
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    isitprime=false;
                }
            }
            return isitprime;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(is_prime(31));
    }
}
