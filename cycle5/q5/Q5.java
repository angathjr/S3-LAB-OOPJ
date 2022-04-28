import java.io.*;
import java.util.StringTokenizer;
class Q5
{
    public static void main(String args[]) throws Exception
    {
        int sum=0;
        int n;
        System.out.println("Enter the set of integers:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer s=new StringTokenizer(str," ");
        System.out.println("The entered elements are :");
        while(s.hasMoreTokens())
        {
            n=Integer.parseInt(s.nextToken());
            System.out.println(n);
            sum=sum+n;
        }
        System.out.println("The sum of the numbers is : "+sum);
    }
}
 