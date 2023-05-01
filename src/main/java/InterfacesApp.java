public class InterfacesApp {
    public static void main(String[] args) {
        Alumno estudiante = new Alumno("Ricardo", "Barrios", 19, "upn", "Ing.Informatica", "2do");

        Empleado empleado = new Empleado("Paco", "Ramirez", 40, "Izzi", "Senior Programmer", "15000");

        AlumnoTrabajador estudianteTrabajador = new AlumnoTrabajador("Marcela", "Moncada", 35, "UNLP", "Gestion", "9no", "Facebook", "Publicidad", "15000");

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());
    }
}
