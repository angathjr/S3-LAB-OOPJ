import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Priority extends Thread
{
    public void run(){
        System.out.println("priority of the thread is :"+getPriority());
    }
}
class Q2
{
    public static void  main(String args[])throws IOException
    {
        int i,j;
        Priority p1=new Priority();
        System.out.println("The current priority is "+p1.getPriority());
        System.out.println("Enter the priority of thread: " );
        Scanner s=new Scanner(System.in);
        i=s.nextInt();
        p1.start();
        p1.setPriority(i);
        //System.out.println("priority of thread is changed to :"+p1.getPriority());
        
        
    }
}