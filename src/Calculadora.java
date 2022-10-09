public class Calculadora {
    private CalcOperator operator;

    public Calculadora() {
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
        catch (NullPointerException e) {
            System.out.println("ERROR: Debes poner el operador correcto");
        }

        return result;
    }
}
        
