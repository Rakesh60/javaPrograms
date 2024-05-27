import java.util.Scanner;

public class arrayUserInput {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter values ");
            arr[i] = scan.nextInt();
        }

        for (int i : arr) {
s
            System.out.println(i);

        }

    }

}