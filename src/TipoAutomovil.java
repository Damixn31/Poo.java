public enum TipoAutomovil {
  SEDAN("Sedan", "Auto mediano", 4),
  STATION_WAGON("Station Wagon", "Auto grande", 5),
  HATCHBACK("Hatchback", "Auto compacto", 5),
  PICKUP("Pickup", "Camioneta", 4),
  COUPE("Coupe", "Auto pequeño", 2),
  CONVERTIBLE("Convertible", "Auto deportivo", 2),
  FURGON("Furgon", "Auto utilitario", 3),
  SUV("SUV", "Todo terrreno deportivo", 5);

  //Atributos o constatantes
  private final String nombre;
  private final int numeroPuerta;
  private final String descripcion;

  //Constructor
  TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
    this.nombre = nombre;
    this.numeroPuerta = numeroPuerta;
    this.descripcion = descripcion;
  }

  // getter and setter
  public String getNombre() {
    return nombre;
  }

  public int getNumeroPuerta() {
    return numeroPuerta;
  }

  public String getDescripcion() {
    return descripcion;
  }
    
}
