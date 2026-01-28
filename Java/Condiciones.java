import java.util.Scanner;
public class Condiciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int antiguedad = 0;
        int clave = 0;
        String nombre = "";
        
        System.out.println("Cual es tu nombre? ");
        nombre = in.nextLine();
        System.out.println("Cuantos años tienes trabajando? ");
        antiguedad = in.nextInt();
        System.out.println("Cual es tu clave de departamento? ");
        clave = in.nextInt();

        //Antiguedad para la clave 1
        if (clave == 1){
            if(antiguedad == 1){
                System.out.println(nombre + " derecho a 6 dias");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + " derecho a 14 dias");
            }else if(antiguedad != 7){
                System.out.println(nombre + " derecho a 20 dias");
            }else{
            System.out.println("aun no tiene derecho a vacaciones");
        }

        //Antiguedad para la clave 2
        }else if(clave == 2){
        if(antiguedad == 1){
            System.out.println(nombre + " derecho a 7 dias");
        }else if(antiguedad >= 2 && antiguedad <=6){
            System.out.println(nombre + " derecho a 15 dias");
        }else if(antiguedad != 7){
            System.out.println(nombre + " derecho a 22 dias");
        }else{
        System.out.println("aun no tiene derecho a vacaciones");
    }

    //Antiguedad para la clave 3
}else if(clave == 3)
    if(antiguedad == 1){
        System.out.println(nombre + " derecho a 10 dias");
}else if(antiguedad >= 2 && antiguedad <=6){
        System.out.println(nombre + " derecho a 20 dias");
}else if(antiguedad != 7){
        System.out.println(nombre + " derecho a 30 dias");
}else{
System.out.println("aun no tiene derecho a vacaciones");
}
}
}