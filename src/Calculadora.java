enum Options{
    Add (0), Substract (1),Divide (2), Multiplication (3);
    private final int value;
    
    private Options(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Calculadora {
    public static void main(String[] args) {
        /* Cosas que va ahacer mi calculadora 
         * Preguntar por la operación
         * Leer los numeros a y b
         * Operar e imprimir la respuesta
        */
        System.out.println(
            "Hola, ¿Qué operación quieres realizar?\n"
            + "\t 0) Suma \n"
            + "\t 1) Resta \n"
            + "\t 2) División \n"
            + "\t 3) Multiplicación \n"
        );

        String readValue = System.console().readLine();
        int opt = Integer.parseInt(readValue);
        
        if (opt == Options.Add.getValue()) {

        }
        
    }
    
}
