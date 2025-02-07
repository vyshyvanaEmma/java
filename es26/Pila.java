public interface Pila<T> {
    void push(T info);
    T pop();
    T top();
    boolean isEmpty();
    void clear();
}
