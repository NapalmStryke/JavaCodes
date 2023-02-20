public interface Queue {
    public abstract void enqueue(String value);

    public abstract String dequeue();

    public abstract int size();

}
