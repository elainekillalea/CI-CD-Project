import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) throws IOException {
        int n = 5, m = 6;

        Calculator cal = new Calculator();
        Add Add = new Add();
        Subtract Sub = new Subtract();
        Multiply Mul = new Multiply();
        Divide Divide = new Divide();


        Scanner s = new Scanner(System.in);
        System.out.print("Enter operator ");
        String x = s.next();
        double sum = 0;

        switch(x){
            case "+":
                sum = Add.add(n, m);
                break;
            case "-":
                sum = Sub.subtract(n, m);
                break;
            case "x":
                sum = Mul.multiply(n, m);
                break;
            case "/":
                sum = Divide.divide(n, m);
                break;
            default:
                System.out.print("Invalid operator");
                break;
        }
        System.out.println(sum);

    }
}
