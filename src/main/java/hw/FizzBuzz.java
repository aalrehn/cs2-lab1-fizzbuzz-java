package hw;
public class FizzBuzz {

public static void main (String []args){
    String s = args[0];
    int n = Integer.parseInt(s);
    System.out.println(FizzBuzzTestable.fizzBuzzArray(n));
   
  
    
    for (int i = 1; i<=n; i++){
        if (n < 1) {
  throw new IllegalArgumentException("n < 1");
  
}
       
        if (i % 15 ==0){
            System.out.println("fizz Buzz");
        } else if ( i % 5==0){
            System.out.println("buzz");
              }
              else if (i%3==0){
                  System.out.println("Fizz");
              }
              
        else {
            System.out.println(i);
        } 
    
      
}
  
  }
  }
 
  