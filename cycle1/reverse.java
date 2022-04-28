class reverse
{
    public static void main(String args[])
    {
        int i;
        String str="hello world";
        System.out.println("The given string "+str);
        System.out.println("The reversed string is ");
        for (i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
            
        }

    }   
    
}
