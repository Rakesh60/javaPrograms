package Threading.multithreading;
class A extends Thread{
    public void run(){
        System.out.println(currentThread());
        for( int i=0;i<=5;i++){
            System.out.println("From Class A "+i+currentThread().getName());
        }
       
    }

}

class B extends Thread{
    public void run(){
        System.out.println(currentThread());
        for( int i=0;i<=5;i++){
            System.out.println("From Class B "+i +currentThread().getName());
        }
      
    }

}

public class Thread1 {
    public static void main(String[] args) {
        
        A obj1=new A();
        obj1.start();
      
        B obj2=new B();
        obj2.start();
       
        obj2.setPriority(10);


    
    }

}
