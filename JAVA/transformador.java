public class transformador {
    private double libras;
    private double kilos;

    public transformador(int libras, double kilos) {
        this.libras = libras;
        this.kilos = kilos;
    }

    public static double librasAKilogramos(double libras) {
        return libras * .453;

    }

    public static double kilosAlibras(double kilos) {
        return kilos * 2.204;
    }

}
