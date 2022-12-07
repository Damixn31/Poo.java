public class Motor {
  
  private double cilindrada;
  private TipoMotor tipo;

  //Constructor vacio
  public Motor() {

  }
  //Cosntructor
  public Motor(double cilindrada, TipoMotor tipo) {
    this.cilindrada = cilindrada;
    this.tipo = tipo;
  }

  // getter and setter
  public double getCilindrada() {
    return cilindrada;
  }

  public void setCilindrada(double cilindrada) {
    this.cilindrada = cilindrada;
  }

  public TipoMotor getTipo() {
    return tipo;
  }

  public void setTipo(TipoMotor tipo) {
    this.tipo = tipo;
  }
}
