public class Node {

    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public static void main(String[] args) {
        Node myNode1 = new Node("McCregor");
        Node myNode3 = new Node("Khabib", null);
        Node myNode2 = new Node("Michael", myNode3);
        System.out.println(myNode1);
        System.out.println(myNode2);
        System.out.println(myNode3);
    }

    public String toString() {
        return "Value: " + value + "\nNext: " + next;
    }

}
