package Task9;

import java.util.Optional;

//**************
//*** Task 9 ***
//**************

public class Node {
    private Node next;
    private String data;

    public Node() {}

    public Node(String data) {
        this.data = data;
    }

    // Example of optional
    // There we try to return Optional of String
    // In case of data absence return
    // object Optional witch contains null inside
    public Optional<String> getData() {
        return Optional.ofNullable(data);
    }

    public void setNext(Node node) {
        this.next = node;
    }

    // In this case we return default node wrapped in Optional
    // When data is absent
    public Optional<Node> getNext() {
        return Optional.ofNullable(new Node("default Node"));
    }
}
