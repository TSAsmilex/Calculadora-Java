public class Division implements CalcOperator{
    @Override
    public double operate(double a, double b) {
        if (Math.abs(b) <= 0.001) {
            throw (new ArithmeticException("No se puede dividir por zero >:("));
        }
        
        return a/b;
    }
    
}
