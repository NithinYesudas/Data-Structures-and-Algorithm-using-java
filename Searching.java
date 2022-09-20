import java.util.*;;
public class Searching {
    public int[] arr;
    public Scanner sc;
    public Searching(){
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
        Arrays.sort(arr);
        
    }
   

   
    public int binarySearch(int data){
        int start=0,end =arr.length-1,middle=0;
        while(start<end){
            middle=(start+end)/2;
            if(arr[middle]<data){
                start=middle+1;
            }
            else if(arr[middle]>data){
                end = middle-1;
            }
            else{
                break;
            }
        }
        return middle;
    }
    public static void main(String[] args) {
        Searching obj = new Searching();
        obj.addList();
        System.out.println("Enter the value to search");
        int temp = obj.sc.nextInt();
        
        System.out.println("Index: "+obj.binarySearch(temp));
    }
}
