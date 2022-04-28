class Prime
{
    public static void main(String args[])
    {
        int n,i;
        n=3;
        for(i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("the given number is not prime");
                System.exit(0);
            }
        }
            System.out.println("The given number is prime");
    }
    
}
