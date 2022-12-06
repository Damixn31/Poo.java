public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);


        nissan2.setColor("Amarillo");// aca seria distinto porque este atriburo es propio del objeto, solamente cambia para el
        //Automovil.colorPatente = "Verde"; //de manera directa ahora todos van a ser verde porque es estatico le pertenece a la clase y no al objeto ni a la instancia por eso se cambia para todos
        Automovil.setColorPatente("Azul"); // esta es la manera correcta
                                          
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());


        System.out.println(nissan2.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litro = " + Automovil.calcularConsumoEstatico(300, 60));

   }
}
