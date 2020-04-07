public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        do {
            i += 2;
            System.out.println(i);
        } while (i < 100);


    }
}
