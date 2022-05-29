public class Hello {
    public static void main(String[] args) {
        Hello.world(5);
    
        
    }
    public static void world(int n){
       if(n<=1 ){
           return;

       }
       world(n-1);
       System.out.println(n);
       world(n-1);
    }
    
}
