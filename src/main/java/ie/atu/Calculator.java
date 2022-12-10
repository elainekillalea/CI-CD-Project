package ie.atu;

public class Calculator {
    private int total;
    private int x;
    private int y;

    public Calculator()
    {

    }

    public Calculator(int num1, int num2)
    {
        x = num1;
        y = num2;
        total = 0;
    }

    public int add(int x, int y){
        total = x + y;
        return total;
    }
    public int subtract(int x, int y){
        total = x - y;
        return total;
    }
    public int divide(int x,int y){
        total = x/y;
        return total;
    }
    public int multiply(int x,int y){
        total = x*y;
        return total;
    }
}
