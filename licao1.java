import java.util.Scanner;
public class licao1 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.print("quantos graus?: ");
        double graus = teclado.nextDouble();
        
        System.out.println("graus em fahrenheit: " + (graus * 1.8 + 32));
        System.out.println("graus em kelvin: " + (graus + 273.15));
        System.out.println("graus em Réaumur: " + (graus * 0.8));
       System.out.println("graus em Rankine: " + (graus * 1.8 + 32 + 459.67));
    }
}
