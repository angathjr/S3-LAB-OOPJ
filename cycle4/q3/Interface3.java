interface P
{
   final int p=10;
   void display_p(); 
}
interface P1 extends P
{
    final int p1=12;
    void display_p1();
}
interface P2 extends P
{
    final int p2=7;
    void display_p2();
}
interface P12 extends P1,P2
{
    final int p12=45;
    void display_p12();
}
class Q implements P12
{
    public void display_p()
    {
        System.out.println("The value of p is "+p);
    }
    public void display_p1()
    {
        System.out.println("The value of p1 is "+p1);
    }
    public void display_p2()
    {
        System.out.println("The value of p2 is "+p2);
    }
    public void display_p12()
    {
        System.out.println("The value of p12 is "+p12);
    }
}
class Interface3
{
    public static void main(String args[])
    {
        Q q=new Q();
        q.display_p();
        q.display_p1();
        q.display_p2();
        q.display_p12();
    }
}