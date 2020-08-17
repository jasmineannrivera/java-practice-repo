//given a sentence, please reverse the characters within the sentence while leaving the words in the sentence. You can assume all characters are standard UTF-8 and you can ignore punctuation.  You can also assume for simplicity that you can fit the entire sentence in memory.  Lastly for simplicity, you can assume that there will only ever be one space between each word (so you don't have to worry about mismatched amounts of white space).
//
//        example
//        input: "the cat is fat"
//        output: "eht tac si taf"
//
//        input: "band camp is great!"
//        output: "dnab pmac si !taerg"



public class ReverseChar {
    //method to implement
    public static String reverseCharacters(String input) {
        String[] words = input.split(" ");
        String reversedString = "";
        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(reversedString);
        return reversedString;
    }

    public static void main(String[] args) {
        reverseCharacters("Plastic Doll");
    }
}

