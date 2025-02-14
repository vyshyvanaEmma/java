package es30;

public interface Coda<T> {
    void accoda(T info);
    T estrai();
    T first();
    T last();
    boolean isEmpty();
    void clear();
}
