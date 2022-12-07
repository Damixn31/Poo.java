// enum es una coleccion de valores constantes o atributos
public enum Color {
  ROJO("Rojo"),
  AMARILLO("Amarillo"),
  AZUL("Azul"),
  BLANCO("Blanco"),
  GRIS("Gris Oscuro"),
  NARANJO("Naranja");

  // para hacerlo mas personalizado generemos un atributo constante, ahora a las colores de enum le podemos pasar un string personalizado tambien le podemos pasar mas de un parametro  ej: ("Rojo")
  private final String color;

  // generamos un constructor para que sea mas personalizado
  Color(String color) {
    this.color = color;
  }
  
  // tambien un metodo get
  public String getColor() {
    return color;
  }

  @Override
  public String toString() { //cuando se imprima con el toString va a mostrar el this.color
    return this.color;
  }
}
