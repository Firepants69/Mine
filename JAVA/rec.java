import javax.print.event.PrintEvent;

public class rec {
    public static void main(String[] args) {
        transformador t1 = new transformador(0, 0);

        double libras = 20;
        String rec = "|";
        // System.out.printf("%.0f\t\t%.1f\t\t%.0f\t\t%.2f\t\t", i, t1.kilosAlibras(i),
        // libras,
        // t1.librasAKilogramos(libras));
        System.out.printf("%s\t%s\t|\t%s\t\t%s\t\t\n", "kilogramos", "libras", "libras",
                "kilogramos");
        System.out.println("-----------------------------------------------------------");
        for (int i = 1; i < 200; i++) {
            double kilo = i;
            if (kilo % 3 == 0) {
                rec = "o";
            } else {
                rec = "|";
            }
            System.out.printf("%.0f\t\t%.1f\t" + rec + "\t%.0f\t\t%.2f\t\t\n", kilo, t1.kilosAlibras(kilo), libras,
                    t1.librasAKilogramos(libras));

            libras = libras + 5;

        }
        // for (int i = 1; i < 200; i++) {

        // System.out.printf("%f\t\t%.1f\t\t%f\t\t%.2f\t\t,", kilo,
        // t1.kilosAlibras(kilo), libras,
        // t1.librasAKilogramos(libras));
        // libras = libras + 5;
        // kilo++;

        // }

    }
}