package Rakesh_03_june_task;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new java.io.FileReader("june03.txt"))) {
            String line;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
                
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
