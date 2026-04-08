public class App {
    public static void main(String[] args) throws Exception {
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Nery" , "Lazarini" , "Programador" , 8.50 , 26);
        estudiantes[1] = new Estudiante("Rodrigo" , "Martinez" , "Programador" , 7 , 41);
        estudiantes[2] = new Estudiante("Matias" , "Martinez" , "Gestion Deportiva" , 9.80 , 18);

        
        for (Estudiante n : estudiantes) {
            System.out.println("Me llamo " + n.getNombre() + " y mi promedio es: " + n.getPromedio());
        }
    }
}
