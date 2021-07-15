import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        String color1 = "Rojo";
        String marca1 = "Toyora";
        String placa1 = "YFG-454";

        String color2 = "Negro";
        String marca2 = "VW";
        String placa2 = "AAA-100";


        carro car1 = new carro(color1, marca1, placa1);
        carro car2 = new carro(color2, marca2, placa2);
      
        String colorCarro = car1.getColor();
        String colorCarro2 = car2.getColor();

        String marcaCarro = car1.getmarca();
        String marcaCarro2 = car2.getmarca();

        System.out.println(colorCarro +  marcaCarro);
        System.out.println(colorCarro2 + marcaCarro2);


        System.out.println(car1.getAll());
        String colorCarroa= car1.getColor();
        System.out.println(colorCarroa);

        car1.setColor("Blanco");

        String colorCarrod = car1.getColor();
        System.out.println(colorCarrod);

        System.out.println(car1.getPropetario());
        car1.setPropietario("JUAN");
        System.out.println(car1.getPropetario());
    }
}
