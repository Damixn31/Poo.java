public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        // subaru
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        // los enum se puede usar los switch
        // la nueva version de JDK hace los switch de diferente maneras con una en el case despues de la variable va la -> y sin el break
        tipo = mazda.getTipo();
        switch(tipo) {
          case CONVERTIBLE:
            System.out.println("El automovil es deportivo y descapotable de dos puertas");
            break;
          case COUPE:
            System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            break;
          case FURGON:
            System.out.println("Es un automovil utilitario de transporte, de empresas");
            break;
          case HATCHBACK:
            System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            break;
          case PICKUP:
            System.out.println("Es un automovil de doble cabina o camioneta");
            break;
          case SEDAN:
            System.out.println("Es un automovil mediano");
            break;
          case STATION_WAGON:
            System.out.println("Es un automovil mas grande, con maleta grande");
            break;
        }

        // recorrer un enum con for each
        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta: tipos) {
          System.out.print(ta + " => " + ta.name() + ", " + 
              ta.getNombre() + ", " + 
              ta.getDescripcion() + ", " +
              ta.getNumeroPuerta());
          System.out.println();
        }

   }
}
