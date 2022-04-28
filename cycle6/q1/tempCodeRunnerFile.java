class Thread1 extends Thread
{
    public void run()
    {
        int i=1;
        while(i<=100)
        {
            System.out.println(currentThread() .getName()+":"+i);
            i=i+2;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=2;
        while(i<=100){
            System.out.println(currentThread().getName()+":"+i);
            i=i+2;
        }
    }
}
class Q1
{
    public static void main(String args[]) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("interupted"+e);
        }
        System.out.println("main thread exited");
        
        
    }
}