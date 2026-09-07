package dev.rampmaster;

public class Estudiante extends Usuario implements Colaborable {


  public Estudiante(String nombre, String apellido, String correo, String run) {

    super("Pedro", "Abellano", "pe.ab@example.cl", "18-123-456-0");

  }

  @Override
  public void obtenerInformacion(){

    System.out.println(("El correo y run del usuario son:" + getCorreo() + getRun()));

  }

  @Override

  public void obtenerNombreApellido(){

  }

}