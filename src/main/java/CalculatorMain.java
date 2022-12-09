import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) throws IOException {
        int n = 5, m = 6;

        Calculator cal = new Calculator();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter operator ");
        String x = s.next();
        int sum = 0;

        switch(x){
            case "+":
                sum = cal.add(n, m);
                break;
            case "-":
                sum = cal.subtract(n, m);
                break;
            case "x":
                sum = cal.multiply(n, m);
                break;
            case "/":
                sum = cal.divide(n, m);
                break;
            default:
                System.out.print("Invalid operator");
                break;
        }
        System.out.println(sum);

    }
}
