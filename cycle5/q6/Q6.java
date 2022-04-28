import java.io.*;
class Q6
{
    public static void main(String args[])throws Exception
    {
        FileReader f=null;
        int c=0,w=0,l=0,i;
        f=new FileReader("file.txt");
            do           
            {
                i=f.read();
                if(i==(int)' ')
                    w++;
                if(i==(int)'\n')
                {
                    l++;   
                    w++;
                }
                c++;
            }while(i!=-1);
            f.close();
        System.out.println("The number of characters is : "+(c-(2*l)-1));
        System.out.println("The number of lines is :"+(l+1));
        System.out.println("The number of words is :"+(w+1));

    }
}