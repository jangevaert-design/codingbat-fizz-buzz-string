package edu.cnm.deepdive;

/*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged.

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

public class CodingBatFizzString {

  public static void main(String[] args) {

    System.out.printf("with the String %s, the method will return " + fizzString("fig") + ".\n", "fig");
    System.out.printf("with the String %s, the method will return " + fizzString("dib") + ".\n", "dib");
    System.out.printf("with the String %s, the method will return " + fizzString("fib") + ".\n", "fib");

  }

  public static String fizzString(String str) {
    if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
      return "FizzBuzz";
    } else if (str.charAt(0) == 'f') {
      return "Fizz";
    } else if (str.charAt(str.length() - 1) == 'b')  {
      return "Buzz";
    } else {
      return str;
    }
  }

}
