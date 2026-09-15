package dev.rampmaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Se instancia la clase estudiante, docente y administrativo a modo de prueba

        Estudiante estudiante = new Estudiante("Kiwi", "Test", "kitest@example.ex", "12-345-678-9");

        Docente docente = new Docente("PooMaster", "Java", "PooMaster@example.pro", "12-345-678-9");

        Administrativo administrativo = new Administrativo("Cristian", "Poo", "cris.poo@example.pro", "12-345-678-9");

        System.out.println(administrativo.toString());

        // println imprime con salto de linea

        System.out.println("El estudiante: " + estudiante.getNombre() + " con apellido: " + estudiante.getApellido());

        // print imprime sin salto de linea

        System.out.println("El docente: " + docente.getNombre() + " con apellido: " + docente.getApellido());

        System.out.println("El administrativo: " + administrativo.getNombre() + " con apellido: " + administrativo.getApellido());

        // Se instancian los methods de la interface

        estudiante.obtenerInformacion();
        estudiante.obtenerNombreApellido();
        estudiante.usarJunaColaborador();

        docente.obtenerInformacion();
        docente.obtenerNombreApellido();
        docente.usarJunaColaborador();

        administrativo.obtenerInformacion();
        administrativo.obtenerNombreApellido();
        administrativo.usarJunaColaborador();

         /* PENDIENTES

          Corregir CRUD de infraestructura y adaptar main para hacer uso del CRUD

          */
    }
}