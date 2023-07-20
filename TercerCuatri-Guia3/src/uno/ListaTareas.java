package uno;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas implements MetodosLista{

    // Lista interna que almacena las tareas
    private List<Tarea> tareas;

    // Instancia única de la lista de tareas
    private static ListaTareas instance = null;

    // Constructor privado de la lista de tareas
    private ListaTareas() {
        tareas = new ArrayList<>();
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    //Método estático que devuelve la instancia única de la lista de tareas (SINGLETON)
    public static ListaTareas getInstance(){
        if (instance == null){
            instance = new ListaTareas();
        }
        return instance;
    }

    //Clase anidada interna --> es PUBLIC
    public class Tarea{

        private String descripcion;
        private boolean completada;

        public Tarea(String descripcion, boolean completada) {
            this.descripcion = descripcion;
            this.completada = completada;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public boolean isCompletada() {
            return completada;
        }

        public void setCompletada(boolean completada) {
            this.completada = completada;
        }

    }


    @Override
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
        System.out.println("La tarea " + tarea.getDescripcion() + " fue eliminda correctamente");
    }

    /* Partes de un foreach
    for (tipoDeElemento variable : arreglo o colección) {
    Acciones a realizar con cada elemento
    }*/
    @Override
    public void obtenerTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea.getDescripcion() + " Fue completada: "+ tarea.isCompletada());
        }
    }

    @Override
    public String cantidadTareas() {
            return "Cantidad de tareas en la lista --> " + tareas.size();
    }

}
