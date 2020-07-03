package ExercismExercises;

import java.util.Scanner;

//Given a year, report if it is a leap year.
//The tricky thing here is that a leap year in the Gregorian calendar occurs:
//on every year that is evenly divisible by 4
//except every year that is evenly divisible by 100
//unless the year is also evenly divisible by 400
public class LeapYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || (year % 400 == 0 && year % 100 != 0)) {
            System.out.printf("%d is a leap year!", year);
        } else {
            System.out.printf("%d is not a leap year!", year);
        }
    }
}
