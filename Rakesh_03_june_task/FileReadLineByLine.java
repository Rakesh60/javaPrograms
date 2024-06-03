package Rakesh_03_june_task;

import java.io.File;
import java.util.Scanner;

public class FileReadLineByLine {
    public static void main(String[] args) {
        File fs=new File("lineByline.txt");
        
        try(Scanner scan=new Scanner(fs);) {
            while (scan.hasNextLine()) {
                String textLine=scan.nextLine();
                System.out.println(textLine);
                
            }
        } catch (Exception e) {
          
            System.out.println("Error in Reading Line");
        }
    }
}
