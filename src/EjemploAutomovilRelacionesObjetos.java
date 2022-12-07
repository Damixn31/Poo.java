public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
      //Cosntructor
               
        Persona conductorSubaru = new Persona("Luci", "Martinez");

        // subaru
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for(int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        //Constructor
        

        Persona pato = new Persona("Pato", "Rodriguez");

        // mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque()); //esta es una de las soluciones del error NullPointerException porque no le pasamos Estanque 
        // otra solucion seria ir al Automovil y pasarle a calcularConsumo el metodo this.getEstanque() y despues ir al petodo y hacer un if y preguntar si es null
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
          for(int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        //Constructor
        Persona bea = new Persona("bea", "Gonzales");
        // nissan
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        // esto se conoce como invocaciones encadenadas 
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
          .addRueda(new Rueda("Pirelli", 20, 11.5))
          .addRueda(new Rueda("Pirelli", 20, 11.5))
          .addRueda(new Rueda("Pirelli", 20, 11.5))
          .addRueda(new Rueda("Pirelli", 20, 11.5));


        //Constructor
        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5)};

        Persona lalo = new Persona("Lalo", "Mena");
        
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);


        nissan2.setColor(Color.AMARILLO);// aca seria distinto porque este atriburo es propio del objeto, solamente cambia para el
        nissan2.setTipo(TipoAutomovil.PICKUP);
        //Automovil.colorPatente = "Verde"; //de manera directa ahora todos van a ser verde porque es estatico le pertenece a la clase y no al objeto ni a la instancia por eso se cambia para todos
        Automovil.setColorPatente(Color.AZUL); // esta es la manera correcta
                                          
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());

        //para mostrar las ruedas con un for each
        /*System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()) {
          System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/
    }
}
