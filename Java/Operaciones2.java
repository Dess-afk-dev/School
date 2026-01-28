public class Operaciones2 {
    public static void main(String arg[]){

        int operacion = 1;
        int a = 8;
        int b = 4;
        int resultado = 0;
        
        if(operacion == 1){
            resultado = a + b;
            System.out.println("El resultado es "+ resultado);
        } else if (operacion == 2){
            resultado = a - b;
            System.out.println("El resultado es "+ resultado);
        } else if(operacion == 3){
            resultado = a * b;
            System.out.println("El resultado es "+ resultado);
        }else if(operacion == 4){
            resultado = a / b;
            System.out.println("El resultado es "+ resultado);
        }else{System.out.println("La operación no existe.");}

        }
        
    }