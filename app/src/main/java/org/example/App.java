package org.example;

public class App {
    public static void main(String[] args) {
        Calculate calc = new Calculate();

        System.out.println("Hello World!");
        System.out.println("Sum of 2 and 3 is " + calc.sum(2, 3) + ". Average is " + calc.average(2, 3) + ".");
        System.out.println("Sum of 1 to 10 is " + calc.sumBetween(1, 10) + ". Average is " + calc.averageBetween(1, 10) + ".");
        System.out.println("Sum of odd of 1 to 10 is " + calc.sumOddBetween(1, 10) + ".");
        System.out.println("Sum of even of 1 to 10 is " + calc.sumEvenBetween(1, 10) + ".");
    }

    public String getGreeting() {
        return "Hello World!";
    }
}
