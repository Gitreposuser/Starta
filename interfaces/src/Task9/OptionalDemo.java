package Task9;

//**************
//*** Task 9 ***
//**************

public class OptionalDemo {
    public static void main(String[] args) {
        System.out.println("Creating list with node optional object");
        ListWithOptional list = new ListWithOptional();
        /*
        // Filling list with data
        list.addNode(new Node("node 1"));
        list.addNode(new Node("node 2"));
        list.addNode(new Node("node 3"));
        */

        // This line prevent code from crashing
        // Using Optional instead of simple call
        // Result of call is wrapped in Optional
        // With created object by default;
        Node head = list.getHead().orElse(new Node("default value"));
        // This line will work only if list is not empty
        //Node head = list.getHead().get();
        System.out.println("head of list: " + head
                .getData().orElse("default value"));

        Node nextNode = head.getNext().orElse(new Node());
        System.out.println("next list element: " + nextNode
                .getData().orElse("next default value"));
    }
}
