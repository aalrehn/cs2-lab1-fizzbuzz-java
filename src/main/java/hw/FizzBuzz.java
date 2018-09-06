package hw;
public class FizzBuzz {

public static void main (String []args){
    int n = 17;
    for (int i = 1; i<=n; i++){
        if (n < 1) {
  throw new IllegalArgumentException("n < 1");
}
        if (i % 15 ==0){
            System.out.println("fizz");
        } else if ( i % 5==0){
            System.out.println("buzz");
              }
              
        else {
            System.out.println(i);
        } 
    
    
}
  
  }
  }