import java.util.*;
class Thread3 extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                Random r=new Random();
                Thread.sleep(2000);
                int n=r.nextInt(100);
                System.out.println("Number : " + n);
                if(n==0){
                    System.out.println("Invalid input");
                    System.out.println();
                }
                else if(n%2==0){
                    Thread3 t2=new Thread3();
                    t2.square(n);
                }
                else{
                    Thread3 t3=new Thread3();
                    t3.cube(n);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    synchronized public void square(int n){
        System.out.println("Square : " + (n*n));
        System.out.println();
    }
    synchronized public void cube(int n){
        System.out.println("Cube : " + (n*n*n));
        System.out.println();
    }
}
class Q3 {
    public static void main(String args[]){
        Thread3 t1=new Thread3();
        t1.start();
    }
}