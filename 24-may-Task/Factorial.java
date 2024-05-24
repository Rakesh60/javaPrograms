import java.util.Scanner;

public class Factorial {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find Factorial:");
        int num=scan.nextInt();
        int FactNum=FactorialOfNum(num);
        System.out.println("Factorial of "+num+ " is:"+FactNum);


    }
    public static int FactorialOfNum(int numb){

      int fact=1;
      
        while (numb>0){
            fact*=numb;
            numb--;
        }
       return fact;
  }
}
