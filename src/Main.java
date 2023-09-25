import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido a la aplicación de gestión de tareas más cuca del barrio. \n Por favor, seleccione una opción para continuar");
        int opcion = 0;
        do {
            System.out.println("1. Ingresar una tarea");
            System.out.println("2. Completar una tarea");
            System.out.println("3. Listar las tareas pendientes");
            System.out.println("4. Listar las tareas completas");
            System.out.println("5. Listar todas las tareas");
            System.out.println("6. Eliminar una tarea");
            System.out.println("7. Actualizar una tarea");
            System.out.println("8. Ver detalle de tarea");
            System.out.println("9. Salir");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea");
                    String tarea = leer.next();
                    TodoList.agregarTarea(tarea);
                    break;
                case 2:
                    System.out.println("Realizar funcionamiento de completar una tarea");
                    break;
                case 3:
                    String listaTareasPendientes = TodoList.listarTareasPendientes();
                    System.out.println(listaTareasPendientes);

                    break;
                case 4:
                    System.out.println("Realizar funcionamiento de Listar las tareas completas");
                    break;
                case 5:
                    String listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);
                    break;
                case 6:
                    System.out.println("Realizar funcionamiento de Eliminar una tarea");
                    break;
                case 7:
                    System.out.println("Realizar funcionamiento de Actualizar una tarea");
                    break;
                case 8:
                    System.out.println("Realizar funcionamiento de Ver detalle de tarea");
                    break;
                case 9:
                    System.out.println("Realizar funcionamiento de salir");
                    break;
            }

        } while (opcion != 9);
    }
}