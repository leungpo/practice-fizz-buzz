package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FUZZ = "Fuzz";

    public String countOff(int order) {
        if(order % 3 == 0){
            return FUZZ;
        }
        return Integer.toString(order);
    }
}
