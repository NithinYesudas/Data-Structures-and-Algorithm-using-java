public class PriorityQueueArray {
    int[] arr;

    int front, max;

    public PriorityQueueArray(int max) {
        this.max = max;
        arr = new int[max];
        front = -1;

    }

    public void addData(int data) {
        if (front == -1) {
            front++;
            arr[front] = data;
            return;
        }
        for (int i = front; i >= 0; i--) {
            if (arr[i] > data) {

                arr[i + 1] = data;
                front++;
                return;

            } else {
                arr[i + 1] = arr[i];
            }

        }
        arr[0] = data;
        front++;
    }

    public int remove() {
        int temp = arr[front];
        front--;
        return temp;

    }

    public void display() {

        for (int i = front; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        PriorityQueueArray obj = new PriorityQueueArray(8);
        obj.addData(5);
        obj.addData(1);
        obj.addData(3);
        obj.addData(2);
        obj.addData(4);
        obj.addData(8);

        obj.remove();
        obj.display();
    }

}
