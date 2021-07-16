import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Scanner para leer los datos
        Scanner sc = new Scanner(System.in);        
        //Se crean atributos predeterminados para crear el objeto carro
        String color1 = "Rojo";
        String marca1 = "Toyora";
        String placa1 = "YFG-454";
        //Se crean atributos predeterminados para crear el objeto carro
        String color2 = "Negro";
        String marca2 = "VW";
        String placa2 = "AAA-100";
        //Se crean objetos carro con los atributos posteriormente creados
        carro car1 = new carro(color1, marca1, placa1);
        carro car2 = new carro(color2, marca2, placa2);
        //Uso del metodo getColor
        String colorCarro = car1.getColor();
        String colorCarro2 = car2.getColor();
        //Uso del metodo getMArca
        String marcaCarro = car1.getmarca();
        String marcaCarro2 = car2.getmarca();
        //Imprimir resultado de los metodos llamados anteriormente
        System.out.println(colorCarro +  marcaCarro);
        System.out.println(colorCarro2 + marcaCarro2);
        // Uso de metodos creados en la clase Carro
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
