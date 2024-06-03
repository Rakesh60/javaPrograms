package Rakesh_30_may_Task;

import java.io.File;
import java.util.Scanner;

public class myFile {
    public static void main(String[] args) {
       
            File a =new File("abc.txt");
            try (Scanner b = new Scanner(a)) {
                String data=b.nextLine();
                
                System.out.println(data);
            }
           
        
        catch(Exception e){
            System.out.println(e);
        }
    }
}
