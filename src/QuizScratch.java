import java.util.ArrayList;
import java.util.List;
public class QuizScratch {

    public static boolean isPalindrome(String str) {
        String rev = "";
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev += str.charAt(i);

        return str.equals(rev);

    }





    public static void main(String[] args) {
        isPalindrome("hello");
        isPalindrome("hannah");


    }




}
