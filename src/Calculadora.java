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
        
        do{
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
        }while(operator == null);


        System.out.println("\nEscriba el valor de a\n");

        double a = Double.parseDouble(System.console().readLine());

        System.out.println("\nEscriba el valor de b\n");

        double b = Double.parseDouble(System.console().readLine());

        double result = operator.operate(a, b);

        System.out.println("\nEl resultado es\n " + result);

        
    }
    
}
