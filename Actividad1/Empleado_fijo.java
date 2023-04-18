public class Empleado_fijo extends Empleado {
    private double bono;

    public Empleado_fijo(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularsalario() {
        return getSalario() + getBono();
    }

    @Override
    public void visualizador() {
        System.out.printf("%s %s %s \n", "nombre del empleado:", getNombre(), getApellido());
        System.out.printf("%s %s \n", "genero: ", getGenero());
        System.out.printf("%s %d \n", "el ID del empleado es:", getID());
        System.out.println("-------------------------------------");
        System.out.printf("%s %.0f \n", "el salario basico mensual es: ", getSalario());
        System.out.printf("%s %.0f \n", "el bono mensual del empleado es:", getBono());
        System.out.printf("%s %.0f \n", "el salario final es:", calcularsalario());
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

}
