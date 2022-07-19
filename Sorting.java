import java.util.*;
public class Sorting {
    public int[] arr;
    public Scanner sc;
    public Sorting(){
         sc = new Scanner(System.in);
    }

    public void addList() {
        
        System.out.println("How many elements do you wanna enter: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    
    }

    public void selectionSort(){
        int small=0,swap,pos=0;
        for(int i=0;i<arr.length;i++){
            small = arr[i];
            pos=-1;
            for(int j=i;j<arr.length;j++){
                
                if(small>arr[j]){
                    small = arr[j];
                    pos=j;
                }
            }
            if(pos==-1)
            break;
            swap = arr[i];
            arr[i] = arr[pos];
            arr[pos] = swap;
        }

    }

    public void insertionSort(){
        int swap=0,current;
        for(int i=1;i<arr.length;i++){
            current = i;
            for(int j=current-1;j>=0;j--){
                if(arr[current]<arr[j]){
                    swap = arr[current];
                    arr[current] = arr[j];
                    arr[j] = swap;
                    current=j;

                }
                else{
                    break;
                }
            }
        }
    }
    public void quickSort(){
        quickSortHelper(0, arr.length-1);

    }
    private void quickSortHelper(int low, int high){
       if(low<high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swapHelper(i, j);
            }
        }
        i++;
        swapHelper(i, high);
        quickSortHelper(low, i-1);
        quickSortHelper(i+1, high);
       }
    }
    private void swapHelper(int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];       
        arr[j] = temp;
    }
    

    public void display() {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
       
        
    }
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.addList();
       obj.quickSort();
        System.out.println("After Sorting: ");
        obj.display();
        
    }
    
}
