package dev.rampmaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Se instancia la clase estudiante a modo de prueba

        Estudiante estudiante = new Estudiante("Kiwi", "Test", "kitest@example.ex", "12-345-678-9");

        System.out.println("El estudiante: " + estudiante.getNombre() + " con apellido: " + estudiante.getApellido());

         /* Pendiente integrar metodo obtenerInformacion

         System.out.println(estudiante.obtenerInformacion())

          */
    }
}