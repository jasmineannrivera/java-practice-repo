public class Backup {
    -----------Problem 0--------------
//produce a system that can vary its output based upon a specific count.  This output should vary
//depending on if the count is current at 2, 3 or 6 any number divisible thereby.  If the count is
//not at a number divisible by 2, 3 or 6 it should print the counter, otherwise print foo when the
//count is divisible by 2, print bar when its divisible by 3 or print baz when its divisible by 6.
//This cannot be hard coded, please generate a function that does this.  The system in theory counts
//forever printing values, but you don’t have to worry about memory management or anything
//like that.
//        expected output:
//        1
//        foo
//        bar
//        foo
//        5
//        baz
//        7
//        foo
//        bar
//        foo
//        11

    //method to implement
    public void printFooBarBaz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println("baz");
            } else if (i % 3 == 0) {
                System.out.println("bar");
            } else if (i % 2 == 0) {
                System.out.println("foo");
            } else {
                System.out.println(i);
            }
        }

    }

-----------Problem 1--------------
    //given a sentence, please reverse the characters within the sentence while leaving the words in the sentence. You can assume all characters are standard UTF-8 and you can ignore punctuation.  You can also assume for simplicity that you can fit the entire sentence in memory.  Lastly for simplicity, you can assume that there will only ever be one space between each word (so you don't have to worry about mismatched amounts of white space).
//
//        example
//        input: "the cat is fat"
//        output: "eht tac si taf"
//
//        input: "band camp is great!"
//        output: "dnab pmac si !taerg"

    //method to implement
    public String reverseCharacters(String input) {
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

-----------Problem 2--------------
//given a sorted array list of integers, please create a balanced binary tree.  note that you can use the following helper class if you would like.  You should return the root of the tree as your result.

    input: [1,2,3,4,5,6,7]
    output:     4
            /   \
            2      6
            / \    / \
            1  3   5   7
            (you would return the node with a value of 4)

    //helper class
    public class Node {
        int val;
        Node left;
        Node right;
        Node(int x) { val = x; }
    }
    //method to implement
    public Node balancedTree(ArrayList<Integer> inputList) {
        return helper(inputList, 0, inputList.size() - 1);
    }

    private Node helper(ArrayList<Integer> nums, int low, int high) {
        if(low > high) {
            return null;
        }

        int mid = low + (high - low)/2;
        Node head = new Node(nums.indexOf(mid));
        head.left = helper(nums, low, mid - 1);
        head.right = helper(nums, mid + 1, high);
        return head;

    }
}
