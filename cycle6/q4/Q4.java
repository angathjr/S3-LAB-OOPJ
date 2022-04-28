class Thread4 implements Runnable{
        public void run(){
            try{
                System.out.println( Thread.currentThread().getName() + " have created");
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
}
public class Q4 {
    public static void main(String args[]) throws Exception{
        Thread4 td=new Thread4();
        Thread t1=new Thread(td);
        Thread t2=new Thread(td);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("main thread exited");
    }
}