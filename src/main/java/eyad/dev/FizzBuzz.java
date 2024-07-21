package eyad.dev;

public class FizzBuzz {
    public String checkNumber(int numb){

        if (numb % 3 ==0 && numb % 5 ==0) return "FizzBuzz";
        if (numb % 3 ==0) return "Fizz";
        if (numb % 5 ==0) return "Buzz";

        
        return null;
    }
    
}
