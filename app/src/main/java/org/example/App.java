package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // 4つのパターンを順番に表示する
        printResult(10, 1);
        printResult(25, 1);
        printResult(10, 15);
        printResult(25, 15);
    }

    /**
     * 計算結果を表示する補助メソッド
     */
    public static void printResult(int age, int size) {
        Calculate calc = new Calculate();

        int individual = calc.getIndividualFee(age);
        int total = calc.getTotalFee(age, size);

        if (size >= 10) {
            System.out.println(
                "Age " + age
                    + ", Size " + size
                    + ": Individual " + individual
                    + ", Total " + total
                    + " (Discount applied)."
            );
        } else {
            System.out.println(
                "Age " + age
                    + ", Size " + size
                    + ": Individual " + individual
                    + ", Total " + total
                    + "."
            );
        }
    }
}