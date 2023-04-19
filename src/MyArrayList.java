public class MyArrayList<E> {
//
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[5];
        size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            increaseBuffer();
        }
        elements[size] = element;
        size++;
    }

    private void increaseBuffer() {
        Object[] newArray = new Object[2 * elements.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }
}


//    int size();
//    boolean contains(Object o);
//    void add(T item);
//    void add(T item, int index);
//    boolean remove(T item);
//    T remove(int index);
//    void clear();
//    T get(int index);
//    int indexOf(Object o);
//    int lastIndexOf(Object o);
//    void sort();

