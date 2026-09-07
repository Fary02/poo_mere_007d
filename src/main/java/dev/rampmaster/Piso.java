package dev.rampmaster;

import java.util.HashSet;

public class Piso {

    private HashSet <Sala> salas;
    private int cantidad;

    public Piso(HashSet salas, int cantidad) {

        this.salas = salas;

        this.cantidad = cantidad;

    }

    public HashSet getSala() {

        return salas;

    }

    public void setSala(HashSet salas) {

        this.salas = salas;

    }
    public int getCantidad() {

        return cantidad;

    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }

    public void obtenerSalas(){

        System.out.println("La cantidad de salas por piso es de : " +  getSala());
    }

}
