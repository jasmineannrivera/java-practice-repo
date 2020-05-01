import java.util.ArrayList;

public class LogicMethods {


    private static boolean isNegative(int number) {
        return number <= 0;
    }

    private static boolean isTen(int number) {
        return number == 10;
    }

    private static int countOdds(ArrayList<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                count++;
            }

        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println(isNegative(-4));
        System.out.println(isNegative(4));
        System.out.println(isTen(-10));
        System.out.println(isTen(10));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(countOdds(numbers));



    }


    }


