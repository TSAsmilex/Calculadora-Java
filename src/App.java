import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("For tradicional: "   + ejercicio_1());
        System.out.println("While tradicional: " + ejercicio_1_while());
        System.out.println("Funcional: "         + ejercicio_1_funcional());
    }


    public static int ejercicio_1() {
        int sum = 0;
        
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        
        return sum;
    }


    public static int ejercicio_1_while() {
        int sum = 0;
        int i = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }
        
        return sum;
    }


    public static int ejercicio_1_funcional() {
        IntStream rango = IntStream.range(0, 11);
        return rango.sum();
    }
}
