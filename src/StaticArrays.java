
public class StaticArrays<T> {

    private T[] data;
    private int size;
    private final int capacity;

    public StaticArrays(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity Must Be Greater Than Zero");
        }

        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // 1. Add element at the end
    public void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("Array is Full! Capacity is: " + capacity);
        }
        data[size] = element;
        size++;
    }

    // 2. Insert element at specific index
    public void insertAt(int index, T element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (isFull()) {
            throw new IllegalStateException("Array is Full! Capacity is: " + capacity);

        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        // [1,2,3,4] // capacity is 5
        // insertAt index 1
        // i = 4 , i > 5 , i--
        // data[4] = data[4-1] , [1,2,3,4,4]
        // data[3] = data[3-1] , [1,2,3,3,4]
        // data[2] = data[2-1] , [1,2,2,3,4]
        // now loop will be terminated because i = 1 > 1 (false)
        data[index] = element; // [1,5,2,3,4]
        size++;
    }

    // 3. Get element at index
    public T elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    // 4. Set (update) element at index
    // this will replace the current value with new
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = element;
    }

    // 5. Remove element at index
    public T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removeElement = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;

        return removeElement;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    // 14. Print the array
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

}
