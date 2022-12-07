import java.util.Arrays;

public class EjemploAutomovilArreglo {
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
        

        //Constructor
        

        Persona pato = new Persona("Pato", "Rodriguez");

        // mazda
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque()); //esta es una de las soluciones del error NullPointerException porque no le pasamos Estanque 
        // otra solucion seria ir al Automovil y pasarle a calcularConsumo el metodo this.getEstanque() y despues ir al petodo y hacer un if y preguntar si es null
        mazda.setConductor(pato);
               
        //Constructor
        Persona bea = new Persona("bea", "Gonzales");
        // nissan
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        
        //Constructor
        Persona lalo = new Persona("Lalo", "Mena");
        // suzuki    
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL); 
                                          
        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;
        
        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }
}
