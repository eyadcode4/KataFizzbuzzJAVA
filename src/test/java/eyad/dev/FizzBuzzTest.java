package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    

    @Test
    void test_fizzbuzz_divisible_by3y5_returnfizz() {
        int numb = 15;
        String expected = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkNumber(numb);


        assertEquals(expected, result);
        
    }
    @Test
    void test_fizzbuzz_divisible_by5_returnfizz() {
        int numb = 5;
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkNumber(numb);


        assertEquals(expected, result);
        
    }
    @Test
    void test_fizzbuzz_divisible_by3_returnfizz() {
        int numb = 3;
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkNumber(numb);


        assertEquals(expected, result);
        
    }
    @Test
    void test_fizzbuzz_divisible_by4_returnfizz() {
        int numb = 4;
        String expected = "null";
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.checkNumber(numb);


        assertEquals(expected, result);
        
    }
}
