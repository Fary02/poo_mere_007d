package dev.rampmaster;

public class Estudiante extends Usuario implements Colaborable {


  public Estudiante(String nombre, String apellido, String correo, String run) {

    super(nombre, apellido, correo, run);

  }

  @Override
  public void obtenerInformacion(){

    System.out.println(("El correo y run del usuario son:" + getCorreo() + getRun()));

  }

  @Override

  public void obtenerNombreApellido(){

  }

}