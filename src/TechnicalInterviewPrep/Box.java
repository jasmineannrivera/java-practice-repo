package TechnicalInterviewPrep;
//this is an example of a linked list
//here is what a visualization looks like:
// [1] -> [5] -> [9]
// this class represents a single node or box
// each node contains data (int in our example) and the reference to the following node.

public class Box {
    int data;
    Box next;
    Box(int givenData) {
        this.data = givenData;
    }
}
