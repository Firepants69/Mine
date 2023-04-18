import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int nuevaLista[] = new int[10];
        for (int i = 0; i < nuevaLista.length; i++) {
            nuevaLista[i] = src.nextInt();
        }
        System.out.println();
        // System.out.println(pruebas.elementosRepetidos(nuevaLista));
        for (int i = 0; i < pruebas.elementosRepetidos(nuevaLista).length; i++) {
            System.out.print(pruebas.elementosRepetidos(nuevaLista)[i] + "\t");
        }
    }
}
