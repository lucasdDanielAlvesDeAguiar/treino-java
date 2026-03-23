import java.util.Scanner;

public class licao4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("qual a altura da sua parede: ");
        double altura = teclado.nextDouble();
        System.out.print("qual a largura da sua parede: ");
        double largura = teclado.nextDouble();

        System.out.print("qual a altura do azulejo: ");
        double alturaAzulejo = teclado.nextDouble();

        System.out.print("qual a largura do azulejo: ");
        double larguraAzulejo = teclado.nextDouble();

        double areadaparede = altura * largura;
        double areadoazulejo = alturaAzulejo * larguraAzulejo;
        double azulejos = areadaparede / areadoazulejo;
        System.out.println("você vai precisar de " + azulejos + " azulejos para cobrir a parede");
    }
    double altura = 0;
    double largura = 0;
    double azulejos = 0;
    double alturaAzulejo = 0;
    double larguraAzulejo = 0;

}
