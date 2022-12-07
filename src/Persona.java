public class Persona {

  private String nombre;
  private String apellido;

  // Constructor
  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }


  @Override
  public String toString() {
    return nombre + " " + apellido;
  }
}
