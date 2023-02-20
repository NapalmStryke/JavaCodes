public class NodeQueue implements Queue {
    private Node front;
    private Node back;
    private int size;

    public int size() {
        return this.size;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value, null);
        if (front == null) {
            this.back = newNode;
            this.front = newNode;
        } else {
            Node temp = this.back;
            this.back = newNode;
            temp.setNext(newNode);
        }
        size++;
    }

    public String dequeue() {
        if (front == null) {
            return "Queue is Empty";
        } else {
            String data = front.getValue();
            front = front.getNext();
            size--;
            return data;
        }

    }

}
