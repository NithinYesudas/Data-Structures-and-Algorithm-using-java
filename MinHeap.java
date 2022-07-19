public class MinHeap {
    private int arr[]=new int[100];
    int size=-1;

    public void insert(int data) {
        
        arr[size+1] = data;
        size++;
        insertHelper(size);
    }
    private void insertHelper(int position){
        int swap;
        if(arr[position]<arr[(position-1)/2]){
            swap = arr[position];
            arr[position]= arr[(position -1)/2]; 
            arr[(position-1)/2] = swap;
            insertHelper((position-1)/2);

        }

    }
    public void rootDelete(){
        arr[0] = arr[size];
       size--;
       rootDeleteHelper(0);
    }
    private void rootDeleteHelper(int position){
        int swap;
        if(arr[position]>minValue(position)){
            swap =arr[position];
            arr[position] = arr[minValue(position)];
            arr[minValue(position)] = swap;
            rootDeleteHelper(minValue(position));

        }

    }
    private int minValue(int position){
       
        if(arr[2*position+1] >arr[2*position+2]){
            return 2*position+2;
        }
        else 
        return 2*position+1;
    }
    public void display(){
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        MinHeap obj = new MinHeap();
        obj.insert(8);
        obj.insert(10);
        obj.insert(15);
        obj.insert(20);
        obj.insert(22);
        obj.insert(18);
        obj.insert(26);
        obj.insert(30);
        obj.insert(40);
        obj.insert(1);
        obj.rootDelete();
        obj.display();
        
    }
    
}
