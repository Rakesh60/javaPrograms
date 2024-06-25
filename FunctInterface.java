


@FunctionalInterface
interface A{
    int add(int a,int b);
}


public class FunctInterface {
    public static void main(String[] args) {
        A obj1=(a,b)->a+b;
        A obj2=(a,b)->a-b;

        int r1=obj1.add(30,20); 
        int r2=obj2.add(30,20); 
        System.out.println(r1);
        System.out.println(r2);
    }
}


