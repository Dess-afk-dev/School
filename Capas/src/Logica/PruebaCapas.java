package logica;
import IGU.Pantalla;
public class PruebaCapas {
    //crear el objeto panta que se encarga de llamar o crear la pantalla
    Pantalla panta = new Pantalla();
    //hacer visible la pantalla
    panta.setVisible(true);
    //a la pantalla ponerla relativa a nada
    //es decir no tomes nada como referencia
    //ponerla en medio de la pantalla
    panta.setLocationRelativeTo(null);
}


//    public static void main(String[] args) {
//        //crear el objeto panta que se encarga de llamar o crear la pantalla
//        Pantalla panta = new Pantalla();
//        //hacer visible la pantalla
//        panta.setVisible(true);
//        //a la pantalla ponerla relativa a nada
//        //es decir no tomes nada como referencia
//        //ponerla en medio de la pantalla
//        panta.setLocationRelativeTo(null);
//    }