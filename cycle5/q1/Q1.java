import java.io.*;
import java.util.Scanner;
class Q1
{
    public static void main(String args[]) 
    {
        int i;
        try
        {
            FileReader f1=new FileReader("file1.txt");
            FileReader f2=new FileReader("file2.txt");
            FileWriter f3=new FileWriter("file3.txt");
            while((i=f1.read())!=-1)
            {
                f3.write((char)i);
            }
            f3.write((char)'\n');
            while((i=f2.read())!=-1)
            {
                f3.write((char)i);
            }
            System.out.println("The files are sucessfully copied");
            f1.close();
            f2.close();
            f3.close();
        }catch(Exception e)
        {
            System.out.println("There occured a error in reading the file" +e);
        }
    }
}