import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int[] a = {4, 5, 1};
            System.out.println(a[0]);
        } catch (Exception e) {
            System.out.println("error girl");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your fav number?");
        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Please enter a number");
        }
        try {
            int[] b = {1};
            System.out.println(b[1]);
        } catch (NullPointerException e) {
            System.out.println("Your arrray is null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bounds!!");
        }
    }
}
