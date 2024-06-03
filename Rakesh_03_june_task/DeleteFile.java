package Rakesh_03_june_task;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fs=new File("test.txt");
    
    if(fs.delete()){
        System.out.println("File deleted Success fully");

    }
    else{
        System.out.println("Error in Deleting");
    }
    }
}
