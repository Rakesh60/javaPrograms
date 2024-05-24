import java.util.Scanner;

public class SimpleInterest {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the principal amount: ");
    double principal = scan.nextDouble();

    System.out.print("Enter the interest rate per year (like--> for 5% enter 5): ");
    double interestRate = scan.nextDouble();

    System.out.print("Enter the time period in years: ");
    double time = scan.nextDouble();

   
    double simpleInterest = (principal * interestRate * time) / 100;

  
    System.out.println("Simple Interest: " + simpleInterest);

    
  }
}
