package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        if(order % 3 == 0){
            return "Fuzz";
        }
        return Integer.toString(order);
    }
}
