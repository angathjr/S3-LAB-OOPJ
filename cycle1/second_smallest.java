class second_smallest
{
    public static void main(String args[])
    {
        int ar[]={0,1,7,2,2};
        int s1,s2,len=ar.length;
        s1=ar[0];
        s2=ar[0];
        for(int i=1;i<len;i++)
        {
            if(ar[i]<s1)
            {
                s1=ar[i];             
            }
            if(s2<ar[i])
            {
                s2=ar[i];
            }
        }
        for(int i=0;i<len;i++)
        {
            if(ar[i]!=s1)
            { 
                if(ar[i]<s2)
                {
                    s2=ar[i];             
                }
            }
        }
        if(s1==s2)
            System.out.println("They are equal");
        else
            System.out.println(s2);
    }
}
