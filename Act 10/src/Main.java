public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        System.out.println(emp1.getClass().getSimpleName());
        Empleado dir1 = new Director();
        dir1.trabaja();
        Director dir2 = new Director();
        dir2.trabaja();
        Empleado[] losempleados = new Empleado[5];
        losempleados[0] = new Empleado();
        losempleados[1] = new Empleado();
        losempleados[2] = new Empleado();
        losempleados[3] = new Empleado();
        losempleados[4] = new Director();

        for (Empleado obj : losempleados) {
            obj.trabaja();
                }

            }

        }

    