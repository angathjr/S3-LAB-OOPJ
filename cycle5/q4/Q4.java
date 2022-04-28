import java.io.*;
class Q4
{
    public static void main(String args[]) 
    {
        String f1,f2,str;
        System.out.println("Enter the file name to be open:");
        try{
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            f1=b.readLine();
            System.out.println("\n Enter the file to copy contents:");
            f2=b.readLine();
            PrintWriter p=new PrintWriter(f2);
            BufferedReader br=new BufferedReader(new FileReader(f1));
            int i=1;
            do
            {
                str= br.readLine();
                if(str==null)
                    break;
                p.println(i+" : "+str);
                i++;
            }while(str!=null);
            System.out.println("The data is successfully copied");
            br.close();
            b.close();
            p.close();
        }catch(Exception e)
        {
            System.out.println("Error occured when reading the file "+e);
        }       
    }
}