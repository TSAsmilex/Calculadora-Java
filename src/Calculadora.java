import java.lang.reflect.Constructor;

public class Calculadora {
    private CalcOperator operator = null;

    public Calculadora () {
        this.operator = null;
    }

    public Calculadora (CalcOperator operator) {
        this.operator = operator;
    }
    
    public CalcOperator getOperator() {
        return operator;
    }
    
    public void setOperator(CalcOperator operator) {
        this.operator = operator;
    }

    public double calculate (double a, double b) {
        double result = 0;
        
        try {
            result = operator.operate(a, b);
        }
        catch (ArithmeticException e) {

        }

        return result;
    }
}
        
