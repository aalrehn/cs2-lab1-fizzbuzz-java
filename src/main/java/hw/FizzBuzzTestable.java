package hw;

import java.util.List;
import java.util.ArrayList;


public class FizzBuzzTestable {

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
  
   public static String[] fizzBuzzArray(final int n){
         
      if(n<1){
          throw new IllegalArgumentException("N<1");
          
           
      }
        return null;
  }
   
  
  public static List<String> fizzBuzzList(final int n) 
    {  
        List<String> FizzBuzz = new ArrayList<String>();
        
        
        if (n < 1) 
        {
            throw new IllegalArgumentException("n < 1");
        }
    
        
        if (n > 0)
        {
            int i = 1;
            {
                String store = Integer.toString(i);
                
                if(i % 15 == 0){
                    FizzBuzz.add("Fizz Buzz");
                }
                else if (i%5==0){
                    FizzBuzz.add("Buzz");
                }
                else if ( i%3==0){
                    FizzBuzz.add("Fizz");
                }
                else {
                    FizzBuzz.add(store);
                }           
    }
    
  }
  return FizzBuzz;   
  }
  }
  
 
  
  
  
  
  
 