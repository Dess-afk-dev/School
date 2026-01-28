import operaciones.OperacionesClasePadre;
import operaciones.ClaseHijaResta;
import operaciones.ClaseHijaSuma;

public class Main { //clase principal
    public static void main(String[] args) { //método main
        //se crea el objeto para que se comunique con la clase hija suma
        OperacionesClasePadre mensajeroSuma = new ClaseHijaSuma();

        mensajeroSuma.pedirDatos(); //llamada al método
        mensajeroSuma.operaciones(); //llamada al método
        System.out.print("El resultado de la suma es: "); 
        mensajeroSuma.mostrarResultado(); //llamada al método

        //se crea el objeto para que se comunique con la clase hija resta
        OperacionesClasePadre mensajeroResta = new ClaseHijaResta();

        mensajeroResta.pedirDatos(); //llamada al método
        mensajeroResta.operaciones(); //llamada al método
        System.out.print("El resultado de tu resta es: "); 
        mensajeroResta.mostrarResultado(); //llamada al método
    }
}
       