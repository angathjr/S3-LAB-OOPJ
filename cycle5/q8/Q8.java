import java.io.*;
import java.util.Scanner;
class Salesman
{
    String name;
    int code;
    double s_amt;
    double commission;
    Salesman()
    {
        name=" ";
        code=0;
        s_amt=0;
        commission=0;
    }
}
class InvalidAmount extends Exception
{
    InvalidAmount(String str)
    {
        super(str);
    }
}
class Q8
{
    public static void main(String args[])throws IOException
    {
        int num;
        Salesman sales[]=new Salesman[100];
        Scanner s=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of salesman present");
        num=s.nextInt();
        for(int i=0;i<num;i++)
        {
            try {
                sales[i]=new Salesman();
                System.out.println("Enter the name: ");
                sales[i].name=br.readLine();
                System.out.println("Enter the customer code :");
                sales[i].code=s.nextInt();
                System.out.println("Enter the sales amount: ");
                sales[i].s_amt=s.nextDouble();
                double amt=sales[i].s_amt;
                if(amt<2000)
                {
                    sales[i].commission=amt*.08;  
                }
                else if(amt>=2000 && amt<=5000)
                {
                    sales[i].commission=amt*.010;
                }
                else if(amt>5000)
                {
                    sales[i].commission=amt*0.12;
                }
                else if(amt<0)
                {
                    throw new InvalidAmount("Invalid sales amount");
                }
            } catch (InvalidAmount e) {
                System.out.println("Sales amount is invalid "+e);
            }catch(Exception e)
            {
                System.out.println("Error:"+e);
            }
            System.out.println("The commission of employee is: "+sales[i].commission);
        }
        s.close();
    }
}