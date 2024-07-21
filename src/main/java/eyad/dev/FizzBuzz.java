package eyad.dev;

public class FizzBuzz {
    public String checkNumber(int numb){

        if (numb % 3 ==0 && numb % 5 ==0) return "FizzBuzz";
        if (numb % 3 ==0) return "Fizz";
        if (numb % 5 ==0) return "Buzz";
        if (String.valueOf(numb).contains("5")) return "Buzz";
        if (String.valueOf(numb).contains("3")) return "Fizz";

        

        else return String.valueOf(numb);
    }
    
}
