package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//If  is odd, print Weird
//        If  is even and in the inclusive range of  2 to 5 , print Not Weird
//        If  is even and in the inclusive range of  6 to 20 , print Weird
//        If  is even and greater than 20, print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n <= 20 )) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        } else if (n % 2 != 0) {
            System.out.println("Weird");
        }
    }

}
