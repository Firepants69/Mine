import java.util.Scanner;

public class Promedio {
    private int tamaño;
    private int[] arreglo = new int[tamaño];
    private int[] lista = new int[tamaño];

    public Promedio(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public static int promedio(int[] arreglo, int[] numeros) {
        int sum = 0;
        double prom = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numeros[i];
            sum += arreglo[i];
        }
        return (int) (prom = sum / arreglo.length);

    }

    public static double promedio(double[] arreglo, double[] numeros2) {
        double sum = 0;
        double prom = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numeros2[i];
            sum += arreglo[i];
        }
        return prom = sum / arreglo.length;

    }

    public static int[] eliminarDuplicados(int[] lista) {
        int[] NuevaLista = new int[lista.length];
        int j, top = 0;
        boolean repetido;
        for (int i = 0; i < lista.length; i++) {
            repetido = false;
            j = 0;
            while (!repetido && (j < top)) {
                if (lista[i] == NuevaLista[j]) {
                    repetido = true;
                }
                j++;
            }
            if (!repetido) {
                NuevaLista[top] = lista[i];
                top++;
            }
        }
        int largoDeListaSinCero = 0;
        for (int i = 0; i < NuevaLista.length; i++) {
            if (NuevaLista[i] != 0) {
                largoDeListaSinCero++;
            }
        }

        int listaSinCero[] = new int[largoDeListaSinCero];
        for (int i = 0; i < NuevaLista.length; i++) {
            if (NuevaLista[i] != 0) {
                listaSinCero[i] = NuevaLista[i];
            }
        }
        return listaSinCero;

    }

    public static boolean isOrdenado(int[] lista) {
        if (lista == null || lista.length <= 1) {
            return true;
        }

        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public void Numeros(int numeros[]) {
        Scanner src = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = src.nextInt();
        }
    }

    public void NumerosDouble(double numeros2[]) {
        Scanner src = new Scanner(System.in);
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = src.nextInt();
        }
    }

}