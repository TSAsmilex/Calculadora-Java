public class Controller {
    public static void main(String[] args) {
        boolean exit = false;

        do {
            System.out.println(
                "Hola, ¿Qué operación quieres realizar?\n"
                + "\t +, -, *, / \n"   
            );
            System.out.println(
                "Pulsa q para salir\n"   
            );
            
            Calculadora calc = new Calculadora();
            
            String readValue = System.console().readLine();
            
            if (readValue.toLowerCase().compareTo("q") == 0) {
                exit = true;
            }
            else if (readValue.compareTo("+") == 0){
                calc.setOperator(new Add());
            }
            else if (readValue.compareTo("-") == 0){
                calc.setOperator(new Substract());
            }
            else if (readValue.compareTo("*") == 0){
                calc.setOperator(new Multiplication());
            }
            else if (readValue.compareTo("/") == 0){
                calc.setOperator(new Division());
            }

            if(!exit){

                System.out.println("\nEscriba el valor de a\n");
                double a = readDouble();
    
                System.out.println("\nEscriba el valor de b\n");
                double b = readDouble();
                
                double result = calc.calculate(a, b);
    
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

