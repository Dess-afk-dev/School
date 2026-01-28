public class Perro extends Animal {//Clase hija Perro hereda de la clase padre Animal

@Override
/* Es una anotación que indica al desarrollador y al compilador que se esta sobrescribiendo un método.
* Se utiliza para indicar que un método en una oubclase está destinado a sobrescribir.
* Esta anotación es opcional, pero es una buena práctica utilizarla, ya que ayuda al compilador a
* detectar posibles errores si el método en la subclase no está realmente sobrescribiendo un método
* de la superclase. */
public void comer () { // método que se sobreescribe heredado de la clase abatracta Animal
System.out.println("El animal perro esta comiendo") ;

@Override
public void desplazarce() { //metodo que se sobreescribe heredado de la clase abstracta Animal
System.out.println("El perro esta corriendo y ladrando");
}
}
}