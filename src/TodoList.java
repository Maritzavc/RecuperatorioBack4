import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public static List<String[]> listaDeTareas = new ArrayList<>();

    public static void agregarTarea(String descripcionTarea){
        // arr[i] = valor
        String[] tarea = new String[3];
        tarea[0] = descripcionTarea;
        tarea[1] = String.valueOf(false);
        tarea[2] = String.valueOf(0);
        listaDeTareas.add(tarea);
    }

    public static void completarTarea(int i, int minutos){
        //Traigo la tarea con el identificador pasado como argumento
        String[] tarea = listaDeTareas.get(i);
        //Actualizo el estado de la tarea
        tarea[1] = String.valueOf(true);
        tarea[2] = String.valueOf(minutos);
    }

    public static String listarTareas() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++){
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            listaTareas = listaTareas + i + tarea[0] + "\n";
        }
        return listaTareas;
    }

    public static String listarTareasPendientes() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++){
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if(!estaTareaCompleta){
                listaTareas = listaTareas + tarea[0] + "\n";
            }
        }
        return listaTareas;
    }

    public static void completarTarea(int i){
        String[] tarea = listaDeTareas.get(i);
        tarea[1] = String.valueOf(true);
    }

    public static boolean eliminarTarea(int indice) {
        if (indice >= 0 && indice < listaDeTareas.size()) {
            listaDeTareas.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public static void actualizarTarea(int indice, String nuevaDescripcion) {
        if (indice >= 0 && indice < listaDeTareas.size()) {
            String[] tarea = listaDeTareas.get(indice);
            tarea[0] = nuevaDescripcion;
            System.out.println("Tarea actualizada con éxito.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    public static String verDetalleTarea(int indice) {
        if (indice >= 0 && indice < listaDeTareas.size()) {
            String[] tarea = listaDeTareas.get(indice);
            return "Detalle de la Tarea:\n" + tarea[0] + " (Completada: " + tarea[1] + ", Tiempo invertido: " + tarea[2] + " minutos)";
        } else {
            return "Índice de tarea no válido.";
        }
    }
}

