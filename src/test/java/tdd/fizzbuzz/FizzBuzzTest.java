package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_say_the_number_when_count_off_given_normal_number(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(1);
        //then
        assertEquals("1",actual);
    }

    @Test
    void should_say_the_number_when_count_off_given_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(6);
        //then
        assertEquals("Fuzz",actual);
    }


}
