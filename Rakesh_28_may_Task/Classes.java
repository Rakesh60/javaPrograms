import java.util.Scanner;

class Person{
    int age;
    String name;
    void displayDetail(){
        System.out.println("Welocme "+name+" Your age is "+age);
    }
}





public class Classes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Person p1=new Person();
        System.out.println("Enter your name and age");
        p1.age=scan.nextInt();
        scan.nextLine();
        p1.name=scan.nextLine();
        
        p1.displayDetail();
        scan.close();

    }
}
