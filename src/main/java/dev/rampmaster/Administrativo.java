package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {


  public Administrativo(String nombre, String apellido, String correo, String run) {


  super(nombre, apellido, correo, run);

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
