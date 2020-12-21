package TechnicalInterviewPrep;

public class AssessmentReview {

    // Given a string, return a string where
    // for every char in the original string,
    // there are three chars.

    static String multiChar(String input) {
        String newString = "";
        for(int i = 0; i < input.length(); i++) {
            newString += input.substring(i, i+1);
            newString += input.substring(i, i+1);
            newString += input.substring(i, i+1);
        }
        System.out.println(newString);
        return newString;

    }








    public static void main(String[] args) {
       multiChar("hey");
    }
}
