import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to be reversed: ");
        word = input.nextLine();
        Boolean a= true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
             a = false;
            }
        }
       if(a==false){
           System.out.println("not palindrome");
       }
       else{
           System.out.println("palindrome");
       }
        
    }
    
}
