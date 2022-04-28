import java.io.*;
class Q3
{
    public static void main(String args[]) 
    {
        String name;
        int i=0,size=0;
        double min,max,avg,sum;
        int a[]=new int[20];
        try{
            System.out.println("Enter the file to be open");
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            name=b.readLine();
            BufferedReader br=new BufferedReader(new FileReader(name));
            while(br.readLine()!=null)
            {
                a[i]=Integer.parseInt(br.readLine());
                i++;
                size=i;
            }
            br.close();
        }catch(Exception e)
        {
            System.out.println("There exist a problem reading the file"+ e);
        }
        min=a[0];
        max=a[0];
        sum=a[0];
        for(i=1;i<size;i++)
        {
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
            sum=sum+a[i];  
        }
        avg=sum/size;
        System.out.println("max element is: "+max);
        System.out.println("min element is :"+min);
        System.out.println("The average value is: "+avg);
        System.out.println("The range of values if from "+ min +" to "+max);
    }
        
}

