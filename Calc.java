
public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }

    static public int subtract (int a, int b){
        return a - b;
    }

    static public double divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return a / b;
    }

    static public int multiply (int a, int b){
        return a* b;
    }
}