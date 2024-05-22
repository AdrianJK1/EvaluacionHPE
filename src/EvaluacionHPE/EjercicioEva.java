package EvaluacionHPE;
import java.util.Scanner;

public class EjercicioEva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profesor profesor = new Profesor();

        System.out.println("Ingrese su Id Profesor:");
        profesor.id = scanner.nextInt();

        System.out.println("Ingrese su Nombre:");
        profesor.nombre = scanner.next();

        System.out.println("Ingrese su Apellido:");
        profesor.apellidos = scanner.next();

        System.out.println("Ingrese su Edad:");
        profesor.edad = scanner.nextInt();

        System.out.println("Ingrese Materia");
        profesor.materia = scanner.next();

        System.out.println("Años de experiencia");
        profesor.aniosExpeciencia = scanner.nextInt();

        System.out.println("\n");

        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese su Id Estudiante:");
        estudiante.id = scanner.nextInt();

        System.out.println("Ingrese su Nombre :");
        estudiante.nombre = scanner.next();

        System.out.println("Ingrese su Apellido:");
        estudiante.apellidos = scanner.next();

        System.out.println("Ingrese su Edad:");
        estudiante.edad = scanner.nextInt();

        System.out.println("Ingrese su grado:");
        estudiante.grado= scanner.next();

        System.out.println("Ingrese su promedio:");
        estudiante.promedio= scanner.nextDouble();

        System.out.println("\n");

        Administrador administrador = new Administrador();

        System.out.println("Ingrese su Id Administrador:");
        administrador.id = scanner.nextInt();

        System.out.println("Ingrese su Nombre:");
        administrador.nombre = scanner.next();

        System.out.println("Ingrese su Apellido:");
        administrador.apellidos = scanner.next();

        System.out.println("Ingrese su Edad:");
        administrador.edad = scanner.nextInt();

        System.out.println("Ingrese su departamento:");
        administrador.departamento = scanner.next();

        System.out.println("Años de experiencia:");
        administrador.aniosExperiencia = scanner.nextInt();

        //Mostrar informacion
        System.out.println("\n");
        profesor.prepararClase();
        profesor.enseñar();
        profesor.evaluarEstudiante();
        profesor.marcarAsistencia();
        profesor.mostrarInformacion();

        System.out.println("\n");
        estudiante.tomarClase();
        estudiante.presentarTarea();
        estudiante.hacerExamen();
        estudiante.marcarAsistencia();
        estudiante.mostrarInformacion();

        System.out.println("\n");
        administrador.gestionarPersonal();
        administrador.planificarEvento();
        administrador.administarPresupuesto();
        administrador.marcarAsistencia();
        administrador.mostrarInformacion();

    }
}

class Funcionarios {
    protected   int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Funcionarios() {
    }

    public Funcionarios(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public  void mostrarInformacion(){
        System.out.println("-----DATOS DE LA PERSONA-----");
    }
    public void marcarAsistencia(){
        System.out.println("Marcar asistencia");
    }
}

 class Profesor extends Funcionarios{
    protected String materia;
     protected String especialidad;
     protected int aniosExpeciencia;

    public Profesor() {
    }

     public Profesor(int id, String nombre, String apellidos, int edad, String materia, String especialidad, int aniosExpeciencia) {
         super(id, nombre, apellidos, edad);
         this.materia = materia;
         this.especialidad = especialidad;
         this.aniosExpeciencia = aniosExpeciencia;
     }
     public void prepararClase(){
         System.out.println("Profesor:[clase lista]");
     }
     public void enseñar(){
         System.out.println("Profesor:[Enseñando a los alumnos]");
     }
     public void evaluarEstudiante(){
         System.out.println("Presor:[Evaluar Alumnos]");
     }
     @Override
     public void marcarAsistencia(){
         System.out.println("Profesor:[Asistencia marcada]");
     }
     @Override
     public void mostrarInformacion(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellidos: " + apellidos);
         System.out.println("Edad: " + edad);
         System.out.println("Materia"+ materia);
         System.out.println("Especialidad"+ especialidad);
         System.out.println("Años de experiencia" + aniosExpeciencia);
     }
 }

 class Estudiante extends Funcionarios{
     protected String grado;
     protected Double promedio;

     public Estudiante() {
     }

     public Estudiante(int id, String nombre, String apellidos, int edad, String grado, Double promedio) {
         super(id, nombre, apellidos, edad);
         this.grado = grado;
         this.promedio = promedio;
     }

     public void tomarClase(){
         System.out.println("Alumno:[Tomar clase]");
     }
     public void presentarTarea(){
         System.out.println("Alumno:[Presentar tarea]");
     }
     public void hacerExamen(){
         System.out.println("Alumno:[Desarrollar Examen]");
     }
     @Override
     public void marcarAsistencia(){
         System.out.println("Alumno:[Marcar Asistencia]");
     }
     @Override
     public void mostrarInformacion(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellidos: " + apellidos);
         System.out.println("Edad: " + edad);
         System.out.println("Grado:" + grado);
         System.out.println("Promedio:" + promedio);
     }
 }

 class Administrador extends Funcionarios{
     protected String departamento;
     protected int aniosExperiencia;

     public Administrador() {
     }

     public Administrador(int id, String nombre, String apellidos, int edad, String departamento, int aniosExperiencia) {
         super(id, nombre, apellidos, edad);
         this.departamento = departamento;
         this.aniosExperiencia = aniosExperiencia;
     }

     public void gestionarPersonal(){
         System.out.println("Administrador:[Gestion de personal]");
     }
     public void planificarEvento(){
         System.out.println("Administrador:[Planificacion de eventos]");
     }
     public void  administarPresupuesto(){
         System.out.println("Adminsistrador:[Administrador de presupuesto]");
     }
     @Override
     public void marcarAsistencia(){
         System.out.println("Admnistrador:[Marcar Asistencia]");
     }

     @Override
     public void mostrarInformacion() {
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellidos: " + apellidos);
         System.out.println("Edad: " + edad);
         System.out.println("Departamento:" + departamento);
         System.out.println("Años de experiencia:"+ aniosExperiencia);
     }
 }