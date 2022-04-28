import java.io.*;
class Q2
{
    public static void main(String args[]) 
    {
        String i,m;    
        try
        {
            BufferedReader f1=new BufferedReader(new FileReader("file1.txt"));
            BufferedReader f2=new BufferedReader(new FileReader("file2.txt"));
            PrintWriter f3=new PrintWriter("file3.txt");
            do
            {
                i=f1.readLine();
                m=f2.readLine();
                if(i!=null)
                {
                    f3.println(i);
                }
                if(m!=null)
                {
                    f3.println(m);
                }
            } while((i!=null) || (m!=null));
            f1.close();
            f2.close();
            f3.close();
        }catch(Exception e)   
        {
            System.out.println("Erorr occured "+e);
        }
    }
}