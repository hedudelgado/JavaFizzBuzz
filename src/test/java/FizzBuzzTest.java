import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sorry on 19/04/2016.
 */
public class FizzBuzzTest {
    fizzBuzz fizzbuzz;

    @Before
    public void start(){
        fizzbuzz = new fizzBuzz();
    }

    @Test
    public void testForNumber3(){
        Assert.assertEquals("Fizz", fizzbuzz.result(3));
    }
    @Test
    public void testForNumber5(){
        Assert.assertEquals("Buzz", fizzbuzz.result(5));
    }
    @Test
    public void testForAnyNumber(){
        Assert.assertEquals("4", fizzbuzz.result(4));
    }
    @Test
    public void testForAnyNumberModuleOf3And5(){
        Assert.assertEquals("FizzBuzz", fizzbuzz.result(15));
    }
}