
// William Fabrizio


package recursionassignment_wfabrizio;


public class TestRecursionTest 
{
    
    public static int count7(int n) //45 point
    {    
        if(n == 0)
            return 0;
        else
            if(n%10 == 7)
                return 1 + count7(n/10);
        else
                return count7(n/10);
    }
    
    public static int gcd(int a, int b) //45 point
    {
        if(a%b == 0)
            return b; 
        else 
            return gcd(b, (a%b));
    }
    
    public static void main(String[] args) 
    {
    System.out.println("count7 in 717 =  "+count7(717));
    System.out.println("count7 in 7 =  "+count7(7));
    System.out.println("count7 in 123 =  "+count7(123));
    System.out.println("GCD of  366 and 60 is "+gcd(366,60));
    System.out.println("GCD of  40 and 20 is "+gcd(40,20));
    System.out.println("GCD of  5 and 312 is "+gcd(5,312));
    }
}
    
