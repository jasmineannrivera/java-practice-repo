package TechnicalInterviewPrep;
//this is an example of a linked list
//here is what a visualization looks like:
// [1] -> [5] -> [9]
// this class represents a single node or box
// each node contains data (int in our example) and the reference to the following node.

public class NodeExample {
    //here is the data of the node
    int data;
    //here is the reference to the next node (null by default)
    NodeExample next;
    //and here is a constructor to create a node
    NodeExample(int data) {
        this.data = data;
    }
    //create nodes
    NodeExample nodeExampleA = new NodeExample(6);
    NodeExample nodeExampleB = new NodeExample(3);
    NodeExample nodeExampleC = new NodeExample(4);
    NodeExample nodeExampleD = new NodeExample(2);
    NodeExample nodeExampleE = new NodeExample(1);

    //code to create next relationship
    //nodeA.next = nodeB;

    //how would you find how many nodes there are?
    //start at the head and keep moving down list until you reach where current.next == null

}


