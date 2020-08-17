import org.w3c.dom.Node;

import java.util.ArrayList;
//given a sorted array list of integers, please create a balanced binary tree.  note that you can use the following helper class if you would like.  You should return the root of the tree as your result.

//         input: [1,2,3,4,5,6,7]
//         output: 4
//          /   \
//          2    6
//        / \    / \
//        1  3 5   7
//        (you would return the node with a value of 4)





public class BalanceTree {
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
        //center val of sorted array as the root of the bst
        Node head = new Node(nums.indexOf(mid));
        head.left = helper(nums, low, mid - 1);
        head.right = helper(nums, mid + 1, high);
        return head;

    }


}

