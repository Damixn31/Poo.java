public class Automovil implements Comparable <Automovil>{
  //siempre por standard viene primero los atributos
  // despues el constructor o los constructores
  // despues los metodos getters o setters
  // despues los metodos de operacion, los que realizan calculos, consultas
  // despues los metodos que querramos sobreescribir
  

  //atributos
  private int id; // no hay que inicializarlo porque ya parte en cero
  private String fabricante;
  private String modelo;
  private Color color = Color.GRIS;
  private Motor motor;
  private Estanque estanque;
  private Persona conductor;
  private Rueda[] ruedas;
  private int indiceRuedas;

  private TipoAutomovil tipo; 

  //atributo estatico
  //static String colorPatente = "Naranja";

  private static Color colorPatente = Color.NARANJO;
  private static int capacidadEstanqueEstatico = 30;
  private static int ultimoId; // no hay que inicializarlo porque ya parte en cero

  // atributo constante final, seria comparable como las variables de entornos, NOTA: si esta en private solo la podemos usar aca 
  // son constante que no se puede modificar su valor
  public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
  public static final int VELOCIDAD_MAX_CIUDAD = 60;

  public static final String COLOR_ROJO = "Rojo";
  public static final String COLOR_AMARILLO = "Amarillo";
  public static final String COLOR_AZUL = "Azul";
  public static final String COLOR_BLANCO = "Blanco";
  public static final String COLOR_GRIS = "Gris Oscuro";

  //constructor
  public Automovil() { // esto se conoce constructor vacio, como sobre carga nos permite crear un objeto ej nissan
    this.id = ++ultimoId;  //hacemos un post incremento para que valla incrementando antes el id
    this.ruedas = new Rueda[5];
  }

  public Automovil(String fabricante, String modelo){
    this(); //invocamos para que agrege el id
    this.fabricante = fabricante;
    this.modelo = modelo;
  }

  public Automovil(String fabricante, String modelo, Color color) {
    this(fabricante, modelo); //esto se lo pasa el contructor de arriba para no repetir codigo
    this.color = color;
  }

  public Automovil(String fabricante, String modelo, Color color, Motor motor ) {
    this(fabricante, modelo, color);
    this.motor = motor;
  }

  public Automovil(String fabricante, String modelo, Color color, Motor motor , Estanque estanque) {
    this(fabricante, modelo, color, motor);
    this.estanque = estanque;
  }

  //Constructor para inicialize todo
  public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
    this(fabricante, modelo, color, motor, estanque);
    this.conductor = conductor;
    this.ruedas = ruedas;
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

  public Color getColor(){
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public static Color getColorPatente() {
    return colorPatente;
  }

  public static void setColorPatente(Color colorPatente) {
    Automovil.colorPatente = colorPatente; //usamos el nombre de la clase Automovil
  } 

  public static int getCapacidadEstanqueEstatico() {
    return capacidadEstanqueEstatico;
  }

  public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
    Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
  }

  public TipoAutomovil getTipo() {
    return tipo;
  }

  public void setTipo(TipoAutomovil tipo) {
    this.tipo = tipo;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public Estanque getEstanque() {
    if(estanque == null) {
        this.estanque = new Estanque();
    }
    return estanque;
  }

  public void setEstanque(Estanque estanque) {
    this.estanque = estanque;
  }

  public Persona getConductor() {
    return conductor;
  }

  public void setConductor(Persona conductor) {
    this.conductor = conductor;
  }

  public Rueda[] getRuedas() {
    return ruedas;
  }

  public void setRuedas(Rueda[] ruedas) {
    this.ruedas = ruedas;
  }

  //implementando el medotodo add va agregando de a uno
  public Automovil addRueda(Rueda rueda) {
    if(indiceRuedas < this.ruedas.length) { //como el valor del arreglo es 5 nos si le agregamos 10 va a tirar error entonces con este if lo que hace es que el error desaparesca pero sigue mostrando los 5 y no se sobrepasa
       this.ruedas[indiceRuedas++] = rueda; // mete un post incremento y va aumentando en uno
    }
    return this; // esto retorna el mismo objeto de la clase de esta manera invocamos addRueda de manera encandenada
  }


// Atributos y metodos los nombres empiezan con minusculas
// metodos de operacion donde se realizan calculos y consultas
  public String detalle(){
    String cadenaDetalle = "auto.id = " + this.id +
      "\nauto.fabricante = " + this.getFabricante() +
      "\nauto.modelo = " + this.getModelo();

    if(this.getTipo() != null) {
      cadenaDetalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
    }

    cadenaDetalle += "\nauto.color = " + this.color +
      "\nauto.patenteColor = " + colorPatente;
    if(this.motor != null) {
        cadenaDetalle +=  "\nauto.cilindrada = " + this.motor.getCilindrada();
    }
    //comprobar si el conductor existe
    if(conductor != null) {
       cadenaDetalle += "\nConductor subaru: " + this.getConductor();
    }

    if(getRuedas() != null) {
      cadenaDetalle += "\nRuedas del automovil: ";
      for(Rueda r: this.getRuedas()) {
        cadenaDetalle +=  "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
      }
    }

    return cadenaDetalle;
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
    return km/(this.getEstanque().getCapacidad() * porcentajeBencina);
  } 

  public float calcularConsumo(int km, int porcentajeBencina) {
    return km/(this.getEstanque().getCapacidad() * porcentajeBencina/100f);
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

  @Override
  public int compareTo(Automovil a) { // esta comparacion cuando queremos comparar o ordenar de la clase Arrays.sort()
    return this.fabricante.compareTo(a.fabricante);
  }


}
