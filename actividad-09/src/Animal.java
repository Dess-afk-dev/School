public abstract class Animal {//es una clase abstracta
    public void desplazarse () {//Método comun que se sobrescribira en las clases hijas
        System.out.println("El animal se esta desplazando");
public abstract void comer();//Este método aún no tiene la implementación,
//es decir, no indica cómo come el animal
}
}