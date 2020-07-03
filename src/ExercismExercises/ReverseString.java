package ExercismExercises;

import java.util.Scanner;

//Reverse a string
//For example: input: "cool" output: "looc"
public class ReverseString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse().toString());
    }
}
