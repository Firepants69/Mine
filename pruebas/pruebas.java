
public class pruebas {

    public static int[] elementosRepetidos(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (i != j) {
                    if (lista[i] == lista[j]) {
                        lista[i] = 0;
                    }
                }
            }
        }
        int tamaño = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                tamaño++;
            }
        }
        int nuevaLista[] = new int[tamaño];
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                nuevaLista[j] = lista[i];
                j++;
            }
        }
        return nuevaLista;

    }

}
