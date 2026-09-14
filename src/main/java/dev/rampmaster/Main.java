package dev.rampmaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Se instancia la clase estudiante y docente a modo de prueba

        Estudiante estudiante = new Estudiante("Kiwi", "Test", "kitest@example.ex", "12-345-678-9");

        Docente docente = new Docente("PooMaster", "Java", "PooMaster@example.pro", "12-345-678-9");

        // println imprime con salto de linea

        System.out.println("El estudiante: " + estudiante.getNombre() + " con apellido: " + estudiante.getApellido());

        // print imprime sin salto de linea

        System.out.println("El docente: " + docente.getNombre() + " con apellido: " + docente.getApellido());

        // Se instancian los methods de la interface

        estudiante.obtenerInformacion();
        estudiante.obtenerNombreApellido();
        estudiante.usarJunaColaborador();

        docente.obtenerInformacion();
        docente.obtenerNombreApellido();
        docente.usarJunaColaborador();


         /* PENDIENTES

          AGREGAR SISTEMA CASCADA PARA INTERACION CON SALA, PISO Y SEDE

          AGREGAR SISTEMA MENU, CRUD PARA TODO

          */
    }
}