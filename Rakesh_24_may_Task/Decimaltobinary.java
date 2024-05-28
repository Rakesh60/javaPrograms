import java.util.Scanner;

public class Decimaltobinary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the decimal number: ");
        int numb = scan.nextInt ();
        String binConvert = decimalToBinary(numb);
        System.out.println ( numb+" The output is: " +binConvert);    
       }
    public static String decimalToBinary(int numb){

          int remainder = 0;

           String binaryNum ="";


          while (numb != 0){
            remainder = numb % 2;
            numb /= 2; 
            binaryNum = remainder+binaryNum;
          }
         return binaryNum;

    }
    
 
   
    
    }