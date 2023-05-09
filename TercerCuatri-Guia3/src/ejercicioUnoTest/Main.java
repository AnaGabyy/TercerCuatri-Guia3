package ejercicioUnoTest;

import ejercicioUno.ListaTareas;

public class Main {
    public static void main(String[] args) {

        /*Implementación de una lista de tareas que utiliza el patrón Singleton para garantizar que solo se
        cree una instancia de la lista en tode el programa, una clase interna para almacenar las tareas y una interfaz
        para definir los métodos de la lista.*/

        ListaTareas listaTareas = ListaTareas.getInstance();
        ListaTareas.Tarea tarea1 = listaTareas.new Tarea("Tarea de POO", true);
        ListaTareas.Tarea tarea2 = listaTareas.new Tarea("Tarea de php", false);
        ListaTareas.Tarea tarea3 = listaTareas.new Tarea("Tarea de S.O", true);
        ListaTareas.Tarea tarea4 = listaTareas.new Tarea("Tarea de requerimientos", false);

        listaTareas.agregarTarea(tarea1);
        listaTareas.agregarTarea(tarea2);
        listaTareas.agregarTarea(tarea3);
        listaTareas.agregarTarea(tarea4);

        listaTareas.obtenerTareas();
        System.out.println(listaTareas.cantidadTareas());
        listaTareas.eliminarTarea(tarea4);
        listaTareas.obtenerTareas();
        System.out.println(listaTareas.cantidadTareas());


    }
}
