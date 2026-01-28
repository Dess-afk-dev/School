public class Operaciones3 {
    public static void main(String[] args) {
        int a = 5, b = 3, resultado = 0;
        int parametro = 2;
        switch(parametro){

            case 1: resultado = a + b;
            System.out.println("El resultado de la suma es " + resultado);
            break;

            case 2: resultado = a - b;
            System.out.println("El resultado de la resta es " + resultado);
            break;

            case 3: resultado = a * b;
            System.out.println("El resultado de la multiplicacion es " + resultado);
            break;

            case 4: resultado = a / b;
            System.out.println("El resultado de la division es " + resultado);
            break;

            default: System.out.println("la opcion no existe.");

        
        }
    }
    
}
