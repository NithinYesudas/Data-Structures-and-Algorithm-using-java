import java.lang.reflect.Array;
import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap = new ArrayList<>();

    private void heapify() {
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex-1) / 2;
            if (heap.get(currentIndex) > heap.get(parentIndex )) {
                int temp = heap.get(currentIndex);
                heap.set(currentIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                currentIndex = parentIndex;
            }
            else if (heap.get(currentIndex) < heap.get(parentIndex)) {
                break;
            }
        }
    }

    public void delete() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }

        int lastIndex = heap.size() - 1;
        heap.set(0, heap.get(lastIndex));
        heap.remove(lastIndex);
        int currentIndex = 0;

        while (currentIndex < lastIndex / 2) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            int largestIndex = leftChildIndex;

            if (rightChildIndex < lastIndex && heap.get(rightChildIndex) > heap.get(leftChildIndex)) {
                largestIndex = rightChildIndex;
            }

            if (heap.get(largestIndex) > heap.get(currentIndex)) {
                // Swap the current element with the largest child
                int temp = heap.get(currentIndex);
                heap.set(currentIndex, heap.get(largestIndex));
                heap.set(largestIndex, temp);
                currentIndex = largestIndex;
            } else {
                break;
            }
        }
    }

    public void insert(int data) {
        if (heap.isEmpty()) {
            heap.add(data);
            return;
        }
        heap.add(data);
        heapify();

    }

    public void printHeap(){
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));
        }
    }

    public static void main(String[] arg) {
        
        Heap heap = new Heap();
        heap.insert(9);
        heap.insert(4);
        heap.insert(5);
        heap.insert(1);
        heap.insert(3);
        heap.insert(2);
        heap.insert(7);
        heap.delete();
        heap.delete();
        heap.printHeap();
   }
}