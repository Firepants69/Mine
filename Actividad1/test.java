import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Empleado_fijo e1 = new Empleado_fijo(0);
        Empleado_Temporal e2 = new Empleado_Temporal(0);
        Scanner src = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            System.out.println("que tipo de empleado vas a registrar?: (temporal o fijo) ");
            String s = obtenerEntradaValidada(src.nextLine(), "fijo", "temporal", 10, src);
            switch (s.toLowerCase()) {
                case "fijo":
                    obtenerDatosEmpleado(e1, src);
                    System.out.println("Ingrese su bono:");
                    e1.setBono(src.nextDouble());
                    System.out.println();
                    System.out.println("Los datos de su empleado son:");
                    e1.visualizador();
                    break;
                case "temporal":
                    obtenerDatosEmpleado(e2, src);
                    System.out.println("Ingrese las horas extras trabajadas:");
                    e2.setHorasExtras(src.nextInt());
                    System.out.println();
                    System.out.println("Los datos de su empleado son:");
                    e2.visualizador();
                    break;
            }
            System.out.println("Quieres repetir el programa?, escribe 1 para repetir, 0  para salir");
            x = src.nextInt();
            src.nextLine();
        }
    }

    public static String obtenerEntradaValidada(String cosa, String dato1, String dato2, int numIntentos,
            Scanner scanner) {
        int intentos = 0;
        while (intentos < numIntentos) {
            if (cosa.equalsIgnoreCase(dato1) || cosa.equalsIgnoreCase(dato2)) {
                return cosa;
            } else {
                System.out.println("Error, coloca " + dato1 + " o " + dato2);
                System.out.println("Las opciones válidas son " + dato1 + " o " + dato2);
                cosa = scanner.nextLine();
            }
            intentos++;
        }
        System.out.println("Número de intentos excedido. Se devolverá el valor predeterminado: " + dato1);
        return dato1;
    }

    public static void obtenerDatosEmpleado(Empleado empleado, Scanner scanner) {
        System.out.println("ingresa su nombre");
        empleado.setNombre(scanner.nextLine());
        System.out.println("ingresa su apellido");
        empleado.setApellido(scanner.nextLine());
        System.out.println("ingrese el genero del empleado masculino o femenino");
        empleado.setGenero(obtenerEntradaValidada(scanner.nextLine(), "masculino", "femenino", 10, scanner));
        System.out.println("ingresa su edad");
        empleado.setEdad(scanner.nextInt());
        System.out.println("ingresa su ID");
        empleado.setID(scanner.nextInt());
        System.out.println("ingresa su salario");
        empleado.setSalario(scanner.nextDouble());
    }
}