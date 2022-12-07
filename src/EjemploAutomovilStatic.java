public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        // subaru
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        //mazda.setEstanque(new Estanque()); //esta es una de las soluciones del error NullPointerException porque no le pasamos Estanque 
        // otra solucion seria ir al Automovil y pasarle a calcularConsumo el metodo this.getEstanque() y despues ir al petodo y hacer un if y preguntar si es null
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        // nissan
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));


        nissan2.setColor(Color.AMARILLO);// aca seria distinto porque este atriburo es propio del objeto, solamente cambia para el
        nissan2.setTipo(TipoAutomovil.PICKUP);
        //Automovil.colorPatente = "Verde"; //de manera directa ahora todos van a ser verde porque es estatico le pertenece a la clase y no al objeto ni a la instancia por eso se cambia para todos
        Automovil.setColorPatente(Color.AZUL); // esta es la manera correcta
                                          
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());


        System.out.println(nissan2.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litro = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc. subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

   }
}
