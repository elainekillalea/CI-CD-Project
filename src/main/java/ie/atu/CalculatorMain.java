package ie.atu;

import ie.atu.Calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        int n = 5, m = 6;

        Calculator cal = new Calculator();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter operator ");
        char op = s.next().charAt(0);
        int sum;

        switch (op) {
            case '+' -> {
                sum = cal.add(n, m);
                System.out.println(n + "+" + m + "=" + sum);
            }
            case '-' -> {
                sum = cal.subtract(n, m);
                System.out.println(n + "-" + m + "=" + sum);
            }
            case '*' -> {
                sum = cal.multiply(n, m);
                System.out.println(n + "*" + m + "=" + sum);
            }
            case '/' -> {
                sum = cal.divide(n, m);
                System.out.println(n + "/" + m + "=" + sum);
            }
            default -> System.out.print("Invalid operator");
        }

    }
}
