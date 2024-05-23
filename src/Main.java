import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Primer cambio");
        System.out.println("Hola amigos, este es un nuevo cambio soy el LOQUENDERO666");
        Scanner sc = new Scanner(System.in);
        Figura_Geometrica figura1 = new Figura_Geometrica();
        Cuadrilateros figura2 = new Cuadrilateros();
        Triangulos figura3 = new Triangulos();
        Circulos figura4 = new Circulos();

        Circulos figura5 = new Circulos( 3);
        Triangulos figura6 = new Triangulos(4.5, 8);
        Cuadrilateros figura7 = new Cuadrilateros(5, 6.7);

        figura2.setNombre("Ploter1");
        System.out.println(figura2.getNombre());
        figura2.setLargo(6.1);
        figura2.setAncho(4.5);
        System.out.println("El area del "+figura2.getNombre()+" es "+figura2.calcularArea()+"\n");

        figura3.setNombre("Panel1");
        System.out.println(figura3.getNombre());
        figura3.setAltura(3.4);
        figura3.setBase(5.2);
        System.out.println("El area del "+figura3.getNombre()+" es "+figura3.calculaArea()+"\n");

        figura4.setRadio(2.00);
        System.out.println(figura4.getRadio());
        figura4.setNombre("Pileta1");
        System.out.println(figura4.getNombre());
        System.out.println("El area del "+figura4.getNombre()+" es "+figura4.calculaArea()+"\n");

        figura5.setNombre("Comedor");
        System.out.println(figura5.getNombre());
        System.out.println("El area del "+figura5.getNombre()+" es "+figura5.calculaArea()+"\n");

        figura6.setNombre("Panel2");
        System.out.println(figura6.getNombre());
        System.out.println("El area del "+figura6.getNombre()+" es "+figura6.calculaArea()+"\n");

        figura7.setNombre("Ploter2");
        System.out.println(figura7.getNombre());
        System.out.println("El area del "+figura7.getNombre()+" es "+figura7.calcularArea()+"\n");


        Heptagono figura8 = new Heptagono(5);
        figura8.setNombre("Heptagono 1");
        System.out.println(figura8.getNombre());
        System.out.println("El perimetro del "+figura8.getNombre()+" es "+figura8.calculaPerimetro()+"\n");
        System.out.println("El area del "+figura8.getNombre()+" es "+figura8.calculaArea()+"\n");

        Octagono figura9 = new Octagono(6);
        figura9.setNombre("Octagono 1");
    }
//ME LA COMES
}
