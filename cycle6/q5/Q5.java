class Account extends Thread{
    int bal;
    Account(int bal){
        this.bal=bal;
    }
    synchronized public void deposit(int d){
        bal=bal+d;
        System.out.println("current bank balance is :"+(bal-d));
        System.out.println("Deposited amount: " + d);
        System.out.println("Balance after depsoit of " + currentThread().getName() + " : " + bal);
        System.out.println("\n");
    }
    synchronized public void withdraw(int w){
        if(w>bal){
            System.out.println("Withdrawal not possible");
        }
        else{
            bal=bal-w;;
            System.out.println("current bank balance is :"+(bal+w));
            System.out.println("Withdrew amount: " + w);
            System.out.println("Balance after withdrawal of " + currentThread().getName() + " : " + bal);
            System.out.println("\n");
        }
    }
}
class Thread5 extends Thread{
    int w,d;
    Account obj;
    Thread5(Account obj,int d,int w){
        this.obj=obj;
        this.d=d;
        this.w=w;
    }
    public void run(){
        obj.deposit(d);
        obj.withdraw(w);
    }
}
public class Q5{
    public static void main(String args[]) throws InterruptedException{
        Account a1=new Account(556566);
        Account a2=new Account(45000);
        Account a3=new Account(47800);
        Thread5 t1=new Thread5(a1,2000,0);
        Thread5 t2=new Thread5(a2,3078,500);
        Thread5 t3=new Thread5(a3,100,1560);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}