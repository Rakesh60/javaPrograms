package Rakesh_03_june_task;

import java.io.FileWriter;

public class AppendText {
    public static void main(String[] args) {
        String fn="june03.txt";
        String txt="Hello Nsti banglore";

        try (FileWriter fw=new FileWriter(fn)){
            fw.write(txt);
            System.out.println("Text appended Successfully");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("not appended");

        }
    }
    
}
