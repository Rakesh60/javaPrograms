import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=scan.nextInt();
        System.out.println("Enter the value of b:");
        b=scan.nextInt();
        System.out.println("The value of a: "+a+ " and value of b before : "+b);
        //?own login
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("The value Swap a=:"+a+ " value Swap b=:"+b);



    }
    
}