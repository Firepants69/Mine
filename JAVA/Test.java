import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Test {
    public static void main(String[] args) {
        Promedio p1 = new Promedio(10);

        Scanner src = new Scanner(System.in);
        System.out.println("que programa quieres ejecutar? presiona 1,2,3 los programas son: ");
        System.out.println("1. calcular promedios de numeros int y doubles. ");
        System.out.println("2. Eliminiar duplicados de un arreglo. ");
        System.out.println("3. Comprobar si un arreglo está ordenado de forma ascendente ");
        String decision = "";
        // elegir cual programa ejecutar
        decision = src.nextLine();
        // programa 1:
        if (decision.equalsIgnoreCase("1")) {
            int[] numeros = new int[p1.getTamaño()];
            System.out.print("ingresa " + numeros.length + " enteros: ");
            p1.Numeros(numeros);
            System.out.println("el promedio es: " + p1.promedio(numeros, numeros));
            double[] numeros2 = new double[p1.getTamaño()];
            System.out.print("ingresa " + numeros2.length + " numeros decimales o enteros: ");
            p1.NumerosDouble(numeros2);
            System.out.println("el promedio es: " + p1.promedio(numeros2, numeros2));
            // programa 2:
        } else if (decision.equalsIgnoreCase("2")) {
            int[] numeros = new int[p1.getTamaño()];
            System.out.print("ingresa " + numeros.length + " numeros enteros: ");
            p1.Numeros(numeros);
            System.out.println();
            System.out.print("los numeros distintos son: ");
            for (int i = 0; i < p1.eliminarDuplicados(numeros).length; i++) {
                System.out.print(p1.eliminarDuplicados(numeros)[i] + " ");
            }
            // programa 3:
        } else if (decision.equalsIgnoreCase("3")) {
            System.out.print("de cuantos elementos es tu lista para verificar si está ordenada: ");
            int numDeElementos = src.nextInt();
            Promedio p2 = new Promedio(numDeElementos);
            int[] numeros = new int[p2.getTamaño()];
            System.out.print("ingresa " + numeros.length + " numeros enteros: ");
            p2.Numeros(numeros);
            System.out.println();
            p2.isOrdenado(numeros);
            if (p2.isOrdenado(numeros) == true) {
                System.out.println("el arreglo está ordenado..");
            } else {
                System.out.println("el arreglo está desordenado...");
            }

        } else {
            System.out.println("inserta algo valido >:(");
        }

    }
}