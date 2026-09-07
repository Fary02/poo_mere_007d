package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {


  public Administrativo(String nombre, String apellido, String correo, String run) {


  super("Juan", "Perez", "jua.pe@example.cl", "12-345-678-0");

  }

  @Override

  public void obtenerInformacion() {

  }

  @Override

  public void obtenerNombreApellido() {

  }

  @Override

  public void usarJunaColaborador() {

  }

}
