package TechnicalInterviewPrep;
//this is an example of a linked list
//here is what a visualization looks like:
// [1] -> [5] -> [9]
// this class represents a single node or box
// each node contains data (int in our example) and the reference to the following node.

public class Node {
    //here is the data of the node
    int data;
    //here is the reference to the next node (null by default)
    Node next;
    //and here is a constructor to create a node
    Node(int data) {
        this.data = data;
    }
}
