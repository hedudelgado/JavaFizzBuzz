
/**
 * Created by sorry on 19/04/2016.
 */
public class fizzBuzz {


    public String result(int number){

        if ( number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";

        } else if ( number % 3 == 0) {
            return "Fizz";

        } else if ( number % 5 == 0) {
            return "Buzz";

        } else {
            return String.valueOf(number);

        }
    }
}
