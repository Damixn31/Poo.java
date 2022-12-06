public class Automovil {
  //siempre por standard viene primero los atributos
  // despues el constructor o los constructores
  // despues los metodos getters o setters
  // despues los metodos de operacion, los que realizan calculos, consultas
  // despues los metodos que querramos sobreescribir
  

  //atributos
  private int id; // no hay que inicializarlo porque ya parte en cero
  private String fabricante;
  private String modelo;
  private String color = "gris";
  private double cilindrada;
  private int capacidadEstanque = 40;

  //atributo estatico
  //static String colorPatente = "Naranja";

  private static String colorPatente = "Naranja";
  private static int capacidadEstanqueEstatico = 30;
  private static int ultimoId; // no hay que inicializarlo porque ya parte en cero
  //constructor
  public Automovil() { // esto se conoce constructor vacio, como sobre carga nos permite crear un objeto ej nissan
    this.id = ++ultimoId;  //hacemos un post incremento para que valla incrementando antes el id
  }

  public Automovil(String fabricante, String modelo){
    this(); //invocamos para que agrege el id
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
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  public static String getColorPatente() {
    return colorPatente;
  }

  public static void setColorPatente(String colorPatente) {
    Automovil.colorPatente = colorPatente; //usamos el nombre de la clase Automovil
  } 

  public static int getCapacidadEstanqueEstatico() {
    return capacidadEstanqueEstatico;
  }

  public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
    Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
  }


// Atributos y metodos los nombres empiezan con minusculas
// metodos de operacion donde se realizan calculos y consultas
  public String detalle(){
    StringBuilder sb = new StringBuilder();
      sb.append("\nauto.id = " + this.id);
      sb.append("\nauto.fabricante = " + this.getFabricante()); //se puede usar de esta manera pasandole el this.getFabricante()
      sb.append("\nauto.modelo = " + this.getModelo());
      sb.append("\nauto.color = " + this.color);// tambien se le puede pasar de esta manera this.color;
      sb.append("\nauto.colorPatente = " + Automovil.colorPatente); // aca esta el atributo estatico
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
 
  // estatico no puedo usar usar atributo comunes tiene que ser estaticos esto nos daria error porque capacidadEstanque es atributo que no es estatico
  public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
    return km/(Automovil.capacidadEstanqueEstatico*porcentajeBencina/100f);
  }


  @Override  //esto es una marca que le indica al compilador en tiempo de ejecucion que estamos sobreescribiendo un metodo de la clase padre
  public boolean equals(Object obj) {
    if(this == obj) { // comparamos por referencia
      return true;
    }
    if(!(obj instanceof Automovil)) {
      return false;
    }
    Automovil a = (Automovil) obj;
    return (this.fabricante != null && this.modelo != null // tenemos que preguntar si es distinto a null porque en tiempo de ejecucion nuestro programa va a saltar un error de este(nullPointerException)
        && this.fabricante.equals(a.getFabricante()) 
        && this.modelo.equals(a.getModelo()));
  }

  @Override
  public String toString() {
    return this.id + " : " + fabricante + " " + modelo;
  }


}
