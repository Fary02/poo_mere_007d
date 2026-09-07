package dev.rampmaster;

public class Docente extends Usuario implements Colaborable {


  public Docente(String nombre, String apellido, String correo, String run) {


    super("Kiwi", "Poo", "ki.po@example.cl", "14-123-456-8");

  }

  @Override

  public void obtenerInformacion(){

  }

  @Override

  public void obtenerNombreApellido(){

  }

  @Override

  public void usarJunaColaborador(){

  }

}
