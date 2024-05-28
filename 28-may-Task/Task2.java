import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    Rectangle(int a,int b){
    this.length=a;
    this.breadth=b;
    
    }
    int AreaofRect(){
        int area=length*breadth;
        return area;
    }
}

public class Task2 {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter length");
        int len=scan.nextInt();
        System.out.println("Enter breadth");
        int bre=scan.nextInt();

        Rectangle r1=new Rectangle(len, bre);
       System.out.println("Area of rectangle "+r1.AreaofRect());
       scan.close();
    }
}
