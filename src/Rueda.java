public class Rueda {
  private String fabricante;
  private int aro;
  private double ancho;

  //Constructor
  public Rueda(String fabricante, int aro, double ancho) {
    this.fabricante = fabricante;
    this.aro = aro;
    this.ancho = ancho;
  }

  // getter
  public String getFabricante() {
    return fabricante;
  }

  public int getAro() {
    return aro;
  }

  public double getAncho() {
    return ancho;
  }
}
