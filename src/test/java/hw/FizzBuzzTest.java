package hw;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class FizzBuzzTest
{
    private FizzBuzzTestable fixture;
    
    
   
    @Before
    public void setUp() throws Exception 
    {
    fixture = new FizzBuzzTestable();
    }

    @After
    public void tearDown() throws Exception 
    {
     fixture = null;
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testForNegative10() 
    {
        FizzBuzzTestable.fizzBuzzArray(-10);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testForNegative1() 
    {
       FizzBuzzTestable.fizzBuzzArray(-1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testForZero() 
    {
        FizzBuzzTestable.fizzBuzzArray(0);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testForOne() 
    {
       FizzBuzzTestable.fizzBuzzArray(1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testForSeven() 
    {
       FizzBuzzTestable.fizzBuzzArray(7);
    }
    
    @Test (expected = IllegalArgumentException.class)
   public void testForSeventeen() 
    {
         
        FizzBuzzTestable.fizzBuzzArray(17);
    }
}
