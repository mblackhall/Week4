package com.marcus.hello.exercises.exercise2;

/**
 * @author marcus
 *         if int divisble by 3  only print 'Fizz'
 *         If int dicisible by 5 only print 'Buzz'
 *         if int divisible by 3 and 5 print FizzBuzz
 *         otherwise print int
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.getFizzBuzz(i));
        }

    }

    public String getFizzBuzz(int number) {
        sb.setLength(0);
        if (number % 3 == 0) {
            sb.append(FIZZ);
        }

        if (number % 5 == 0) {
            sb.append(BUZZ);
        }

        if (sb.length() == 0) {
            sb.append(number);
        }

        return sb.toString();
    }


}
