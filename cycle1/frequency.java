class frequency 
{
    public static void main(String args[])
    {
        int i,count=0;
        String str="hello world";
        char ch='l';
        for(i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("The character occurs "+count+" times");
    }
    
}
