public class Empleado_Temporal extends Empleado {
    private int horasExtras;

    public Empleado_Temporal(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularsalario() {
        return ((((getSalario() / 30) / 8) * getHorasExtras()) * 2) + getSalario();
    }

    @Override
    public void visualizador() {
        System.out.printf("%s %s %s \n", "nombre del empleado:", getNombre(), getApellido());
        System.out.printf("%s %s \n", "genero: ", getGenero());
        System.out.printf("%s %d \n", "el ID del empleado es:", getID());
        System.out.println("-------------------------------------");
        System.out.printf("%s %.0f \n", "el salario basico mensual es: ", getSalario());
        System.out.printf("%s %d \n", "las horas extras chambeadas son:", getHorasExtras());
        System.out.printf("%s %.3f \n", "el salario final es:", calcularsalario());
    }

}
