public class Automovil {
  //siempre por standard viene primero los atributos
  // despues el constructor o los constructores
  // despues los metodos getters o setters
  // despues los metodos de operacion, los que realizan calculos, consultas
  // despues los metodos que querramos sobreescribir
  

  //atributos
  private String fabricante;
  private String modelo;
  private String color = "gris";
  private double cilindrada;
  private int capacidadEstanque = 40;

  //constructor
  public Automovil() { // esto se conoce constructor vacio, como sobre carga nos permite crear un objeto ej nissan

  }

  public Automovil(String fabricante, String modelo){
    this.fabricante = fabricante;
    this.modelo = modelo;
  }

  public Automovil(String fabricante, String modelo, String color) {
    this(fabricante, modelo); //esto se lo pasa el contructor de arriba para no repetir codigo
    this.color = color;
  }

  public Automovil(String fabricante, String modelo, String color, double cilindrada) {
    this(fabricante, modelo, color);
    this.cilindrada = cilindrada;
  }

  public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
    this(fabricante, modelo, color, cilindrada);
    this.capacidadEstanque = capacidadEstanque;
  }

  //  metodo para leer y modificar se los conoce como metodos get
  //  get es obtener, tambien se lo conoce como POJO(Plain Old Java Object), siempre contiene datos
  
  // metodos getters y setters
  public String getFabricante(){
    return this.fabricante;
  }

  public void setFabricante(String fabricante){ // set metodos para actualizar modificancion 
    this.fabricante = fabricante;
  }

  public String getModelo(){
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getCilindrada(){
    return this.cilindrada;
  }

  public void setCilindrada(double cilindrada) {
    this.cilindrada = cilindrada;
  }

  public int getCapacidadEstanque(){
    return this.capacidadEstanque;
  }

  public void setCapacidadEstanque(int capacidadEstanque) {
    this.capacidadEstanque = capacidadEstanque;
  }

// Atributos y metodos los nombres empiezan con minusculas
// metodos de operacion donde se realizan calculos y consultas
  public String detalle(){
    StringBuilder sb = new StringBuilder();
      sb.append("\nauto.fabricante = " + this.getFabricante()); //se puede usar de esta manera pasandole el this.getFabricante()
      sb.append("\nauto.modelo = " + this.getModelo());
      sb.append("\nauto.color = " + this.color);// tambien se le puede pasar de esta manera this.color;
      sb.append("\nauto.cilindrada = " + this.cilindrada);
      return sb.toString();
  }

  public String acelerar(int rpm) {
    return "el auto " + fabricante + " acelerando a " + rpm + "rpm";
  }

  public String frenar() {
    return fabricante + " " + this.modelo + " frenando!";
  }

  public String acelerarFrenar(int rpm) {
    String acelerar = this.acelerar(rpm);
    String frenar = this.frenar();
    return acelerar + "\n" + frenar;
  }

  public float calcularConsumo(int km, float porcentajeBencina) {
    return km/(capacidadEstanque*porcentajeBencina);
  } 

  public float calcularConsumo(int km, int porcentajeBencina) {
    return km/(capacidadEstanque*porcentajeBencina/100f);
  }

  @Override  //esto es una marca que le indica al compilador en tiempo de ejecucion que estamos sobreescribiendo un metodo de la clase padre
  public boolean equals(Object obj) {
    Automovil a = (Automovil) obj;
    return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
  }


}
