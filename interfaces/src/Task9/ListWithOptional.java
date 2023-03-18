package Task9;

import java.util.Optional;

//**************
//*** Task 9 ***
//**************

public class ListWithOptional {
    private Node head;
    private Node curNode;

    public void addNode(Node node) {
        if(head == null) {
            head = node;
            curNode = head;
        } else {
            curNode.setNext(node);
        }
    }

    public Optional<Node> getHead() {
        return Optional.ofNullable(head);
    }
}
