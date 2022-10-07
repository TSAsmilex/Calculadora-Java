public class Calculadora {
    public static void main(String[] args) {
        /* Cosas que va ahacer mi calculadora 
         * Preguntar por la operación
         * Leer los numeros a y b
         * Operar e imprimir la respuesta
        */
        boolean exit = false;

        do {
            System.out.println(
                "Hola, ¿Qué operación quieres realizar?\n"
                + "\t +, -, *, / \n"   
            );
            System.out.println(
                "Pulsa q para salir\n"   
            );
            
            CalcOperator operator = null;   // FIXME
            
            do {
                String readValue = System.console().readLine();
                if (readValue.toLowerCase().compareTo("q") == 0) {
                    exit = true;
                }
                else if (readValue.compareTo("+") == 0){
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
            } while((operator == null)&&(!exit));

            if(!exit){

                System.out.println("\nEscriba el valor de a\n");
                double a = readDouble();
    
                System.out.println("\nEscriba el valor de b\n");
                double b = readDouble();
                
                double result = operator.operate(a, b);
    
                System.out.println("\nEl resultado es\n " + result);        
            }
        
        } while (!exit);
    }

    
    private static double readDouble() {
        boolean is_double = false;
        double     number    = 0;

        do {
            try {
                number = Double.parseDouble(System.console().readLine());
                is_double = true;
            }
            catch(NumberFormatException e){
                System.out.println("Debes introducir un número");
                is_double = false;
            }
        }while(!is_double);

        return number;
    }
}
