import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA); // creamos la variable y la usamos en subaru.setMotor()
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Motor motorNissan = new Motor(4.0, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Estanque(50));
        Motor motorNissan2 = new Motor(3.5, TipoMotor.BENCINA);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan2, new Estanque(50));


        Automovil auto = new Automovil();
        Date fecha = new Date(); //comparamos con otro tipo de dato
        System.out.println("Son iguales?: " + (nissan == nissan2));
        System.out.println("Son iguales con equals?: " + (nissan.equals(nissan2)));

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println(auto.equals(fecha));
        //el hashcode es un identificador unico
        System.out.println(nissan); // esto es de forma implicita
        System.out.println(nissan.toString()); //esto es de forma explicita es igual que arriba va a dar el mismo resultado

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("kilometos por litro: " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("kilometos por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("kilometos por litro: " + nissan.calcularConsumo(300, 60));
    }
}
