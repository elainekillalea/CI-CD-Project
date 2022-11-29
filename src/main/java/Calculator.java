public class Calculator {
    private int total;

    public Calculator()
    {
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