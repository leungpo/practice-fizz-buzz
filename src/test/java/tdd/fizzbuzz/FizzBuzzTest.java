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
    void should_say_Fizz_when_count_off_given_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(6);
        //then
        assertEquals("Fizz",actual);
    }

    @Test
    void should_say_Buzz_when_count_off_given_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(10);
        //then
        assertEquals("Buzz",actual);
    }

    @Test
    void should_say_Whizz_when_count_off_given_multiple_of_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(14);
        //then
        assertEquals("Whizz",actual);
    }

    @Test
    void should_say_FizzBuzz_when_count_off_given_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(15);
        //then
        assertEquals("FizzBuzz",actual);

    }

    @Test
    void should_say_FizzWhizz_when_count_off_given_multiple_of_3_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(21);
        //then
        assertEquals("FizzWhizz",actual);

    }

    @Test
    void should_say_BuzzWhizz_when_count_off_given_multiple_of_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(35);
        //then
        assertEquals("BuzzWhizz",actual);
    }

}
