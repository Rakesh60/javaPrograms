package Rakesh_28_may_Task;

import java.util.Scanner;

class circle{
    double radius;
    double pi=22.0/7.0;
    circle(double rad){
        this.radius=rad;
    }
    double Area(){
        return pi*(radius*radius);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOUR RADIUS ");
        double rad=scan.nextDouble();
        circle c1=new circle(rad);
       System.out.println("Area of Circle "+ c1.Area());
       scan.close();
        
    }
    
}
