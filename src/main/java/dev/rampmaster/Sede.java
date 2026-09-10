package dev.rampmaster;

import java.util.HashSet;

public class Sede {

    private HashSet<Piso> pisos;
    private String nombre;
    private String direccion;

    public Sede(HashSet pisos, String nombre, String direccion) {

        this.pisos = pisos;
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public HashSet getPiso() {

        return pisos;

    }

    public void setPiso(HashSet pisos) {

        this.pisos = pisos;
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getDireccion() {

        return direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public void obtenerPiso() {

        System.out.println("La cantidad de pisos de la sede es de: " + getPiso());

    }

}
