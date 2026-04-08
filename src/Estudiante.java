public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private double promedio;
    private int edad;

    public Estudiante(String nombre , String apellido , String carrera , double promedio , int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.promedio = promedio;
        this.edad = edad;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getEdad() {
        return edad;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public void setApellido(String apellido) {
        this.apellido = apellido;
    }

        public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

        public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

        public void setEdad(int edad) {
        this.edad = edad;
    }
}
