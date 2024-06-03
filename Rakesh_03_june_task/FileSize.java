package Rakesh_03_june_task;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File fs=new File("june03.txt");
        if (fs.exists()) {
            long bytes=fs.length();
            double kb=(double)bytes/1024;
            double mb=kb/1024;
            System.out.println("File size in Bytes: "+bytes);
            System.out.println("File size in KiloBytes: "+kb);
            System.out.println("File size in Megabytes: "+mb);

            
        } else {
            System.out.println("File not exist");
        }
    }
}
