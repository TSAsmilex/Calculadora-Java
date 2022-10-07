public class Calculadora {
    public static void main(String[] args) {
        /* Cosas que va ahacer mi calculadora 
         * Preguntar por la operación
         * Leer los numeros a y b
         * Operar e imprimir la respuesta
        */
        System.out.println(
            "Hola, ¿Qué operación quieres realizar?\n"
            + "\t +, -, *, / \n"   
        );
        
        CalcOperator operator = null;   // FIXME
        
        do {
            String readValue = System.console().readLine();
            
            if (readValue.compareTo("+") == 0){
                operator = new Add();
            }
            else if (readValue.compareTo("-") == 0){
                operator = new Substract();
            }
            else if (readValue.compareTo("*") == 0){
                operator = new Multiplication();
            }
            else if (readValue.compareTo("/") == 0){
                operator = new Division();
            }
            else{
                System.out.println("Esa operación no está definida");
            }
        } while(operator == null);


        System.out.println("\nEscriba el valor de a\n");

        boolean is_double = false;
        double a = 0, b = 0;

        do  {
            try {
                a = Double.parseDouble(System.console().readLine());
                is_double = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Debes introducir un número");
                is_double = false;
            }

        } while (!is_double);

        is_double=false;
        System.out.println("\nEscriba el valor de b\n");
        do {
            try {
                b = Double.parseDouble(System.console().readLine());
                is_double = true;
            }
            catch(NumberFormatException e){
                System.out.println("Debes introducir un número");
                is_double = false;
            }
        }while(!is_double);

        double result = operator.operate(a, b);

        System.out.println("\nEl resultado es\n " + result);        
    }
    
}
