package ie.atu;

import java.util.Scanner;

public class calculatingNumber {

    public double calculatingNumbers(char ops, int x, int y){

        int n = 5, m = 6;

        Add Add = new Add();
        Subtract Sub = new Subtract();
        Multiply Mul = new Multiply();
        Divide Divide = new Divide();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter operator ");
        char op = s.next().charAt(0);
        double sum = 0;
        switch (op) {
            case '+' -> {
                sum = Add.add(n, m);
                System.out.println(n + "+" + m + "=" + sum);
            }
            case '-' -> {
                sum = Sub.subtract(n, m);
                System.out.println(n + "-" + m + "=" + sum);
            }
            case '*' -> {
                sum = Mul.multiply(n, m);
                System.out.println(n + "*" + m + "=" + sum);
            }
            case '/' -> {
                sum = Divide.divide(n, m);
                System.out.println(n + "/" + m + "=" + sum);
            }
            default -> System.out.print("Invalid operator");
        }
        return sum;
    }

}

