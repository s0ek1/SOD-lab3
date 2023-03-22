package priorityQueue.array;

import java.util.Arrays;

public class ArrayQueueProcessor implements ArrayQueue {
    private int[] data = new int[10];
    private int size = 0;
    @Override
    public void add(int element) {
        ensureCapacity(size+1);
        data[size++] = element;
        sort();
    }

    @Override
    public int remove() {
        int result = data[0];
        data[0] = data[--size];
        sort();
        return result;
    }

    void heapify(int array[], int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && array[left] < array[largest]) largest = left;
        if (right < size && array[right] < array[largest]) largest = right;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, size, largest);
        }
    }

    public void sort() {
        int n = size;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(data, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            heapify(data, i, 0);
        }
    }

    private void ensureCapacity(int size){
        if (data.length < size){
            data = Arrays.copyOf(data, data.length+10);
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(", ");
        }
        if  (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
            sb.append("]");
            return sb.toString();
    }
}
