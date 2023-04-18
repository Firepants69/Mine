public abstract class Empleado {

    private double salario;
    private String nombre;
    private String apellido;
    private int ID;
    private int edad;
    private String genero;

    protected Empleado() {
    }

    protected Empleado(double salario, String nombre, String apellido, int iD, int edad, String genero) {
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        ID = iD;
        this.edad = edad;
        this.genero = genero;
    }

    abstract public double calcularsalario();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    abstract public void visualizador();

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}