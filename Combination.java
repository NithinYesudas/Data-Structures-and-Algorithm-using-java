import java.util.*;

public class Combination {
    public static void main(String[] args) {
        int n,target;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements u wanna enter");
        n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();

        }
        System.out.println("Enter target: ");
        target = input.nextInt();
        int sum=0;

      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            
              sum+=arr[i]+arr[j];
              if(sum==target)break;
              sum=0;
             
          }
          if(sum==target)break;
          for(int j=i+1;j<n;j++){
            sum+=arr[i]+arr[j];
            if(sum==target)break;
            
            }
            if(sum==target)break;
      }
    }
    
}
