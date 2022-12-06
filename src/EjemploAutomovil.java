public class EjemploAutomovil {
    public static void main(String[] args) {

      Automovil subaru = new Automovil("Subaru", "Impreza");
      subaru.setCilindrada(2.0);
      subaru.setColor("Blanco");

      Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
      System.out.println("mazda.fabricante = " + mazda.getFabricante());

      Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
      Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
      System.out.println("Son iguales?: " + (nissan == nissan2));
      System.out.println("Son iguales con equals?: " + (nissan.equals(nissan2)));

      System.out.println(subaru.detalle());
      System.out.println(mazda.detalle());
      System.out.println(nissan.detalle());

      System.out.println(subaru.acelerar(3000));
      System.out.println(subaru.frenar());

      System.out.println(mazda.acelerarFrenar(4000));

      System.out.println("kilometos por litro: " + subaru.calcularConsumo(300, 0.75f));
      System.out.println("kilometos por litro: " + subaru.calcularConsumo(300, 60));
      System.out.println("kilometos por litro: " + nissan.calcularConsumo(300, 60));
    }
}