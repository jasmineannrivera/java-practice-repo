package TechnicalInterviewPrep;

public class FizzBuzz {
    // 0 -> 100 output fizz if num is divisible by 3, buzz if divisible by 5, fizzbuzz for both
    public static void fizzBuzz () {

        //make our loop
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            } if (i % 5 == 0) {
                output += "Buzz";
            } if (output.equals("")) {
                output += i;
            }
            System.out.println(output);
        }

    }

    public static void main(String[] args) {
        fizzBuzz();
    }


    //avg of all numbers in array list





}
