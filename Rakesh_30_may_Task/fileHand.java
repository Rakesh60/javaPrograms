package Rakesh_30_may_Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHand {
    public static void main(String[] args) {
        //File f=new File("abc.txt");
        
        try {
            FileWriter a = new FileWriter("xyz.txt");
            a.write("file writing java");
            a.close();
        } catch (IOException e) {
            
            System.out.println("file cannot be written");
          
       }
        // try{
        //     f.createNewFile();
        //     System.out.println("created Successfully");
        // }
        // catch(Exception e){
        //     System.out.println("file not created");
        // }
        // if (f.exists()) {
        //     System.out.println("file name is :"+f.getName());
        //     System.out.println("file path is :"+f.getAbsolutePath());
        //     System.out.println("parent is :"+f.getParent());
        //     System.out.println("fil size is :"+f.length() +" bytes");
        //     System.out.println("file  is readable :"+f.canRead());
        //     System.out.println("file  is writable :"+f.canRead());
        // } else {
            
        // }
    }
}
