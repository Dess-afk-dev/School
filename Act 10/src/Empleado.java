class Empleado {
    private String nombre;
    private String edad;
    private double salario;
    public void trabaja() {
        System.out.println("realizo funciones de empleado");
    }
}
class Director extends Empleado {
    public void trabaja() {
        System.out.println("realizo funciones de director");
                }
}
            
        