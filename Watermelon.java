import java.util.Stack;
import java.lang.Math;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int[] arrOne = new int[30];
      int[] arrTwo;
      int n,m;
      System.out.println("Enter the size of first array");
      n = sc.nextInt();
      System.out.println("Enter the elements");
      for(int i = 0;i<n;i++){
      arrOne[i] = sc.nextInt();
      } 
      System.out.println(arrOne.length);
      System.out.println("Enter the size of second array");
      m = sc.nextInt();
      arrTwo= new int[m];
      System.out.println("Enter the elements");
      for(int i = 0;i<m;i++){
      arrTwo[i] = sc.nextInt();
      } 
      int count =n;
      for(int i =0;i<arrTwo.length;i++){
        for(int j =0;j<count;j++){
            if(arrOne[j]>=arrTwo[i]){
               
                for(int k = count;k>=j;k--){
                    arrOne[k] = arrOne[k-1];
                }
                count++;
                arrOne[j] = arrTwo[i];
                break;
            }
            else if(j+1==count){
                arrOne[j+1]=arrTwo[arrTwo.length-1];

            }
        }
      }
      System.out.println("elements of the first array: ");
      for(int i=0;i<=count;i++){
        System.out.println(arrOne[i]);
      }
    }

}
