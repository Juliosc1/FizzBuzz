package org.example;

public class FizzBuzz {
    public String getString(int i){

        if (i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(i);
        }
    }
}
