package Rakesh_03_june_task;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
     int array[]={1,2,3,4,5};
     for(int i:array){
        System.out.print(i+" ");
        
     }
     System.out.println();
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the Array Index to access it");   
     int indx=scan.nextInt();
     try {
        System.out.println("Value at index "+indx+" is "+array[indx]);
     } catch (ArrayIndexOutOfBoundsException e) {
     
           System.out.println(e);
         
     }
     scan.close();
    }
}
