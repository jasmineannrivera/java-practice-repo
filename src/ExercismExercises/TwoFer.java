package ExercismExercises;

import java.util.Scanner;

//Given a name, return a string with the message:
//        One for X, one for me.
//        Where X is the given name.
//        However, if the name is missing, return the string:
//        One for you, one for me.
public class TwoFer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name  = sc.nextLine();
        if (!name.equals("")) {
            System.out.printf("One for %s, one for me", name);
        } else {
            System.out.println("One for you, one for me.");
        }
    }


}
