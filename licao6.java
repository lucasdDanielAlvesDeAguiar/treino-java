import java.util.Scanner;

public class licao6 {
        

     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
         System.out.print("quantos quilogramas voce quer?: ");
        double M = teclado.nextDouble();

        System.out.print("qual a altura escolhida?: ");
        double H = teclado.nextDouble();

        System.out.print("por quanto tempo em segundos?: ");
        double T = teclado.nextDouble();

         System.out.println("você precisara de: " + ((M * H / T) / 745.6999) + " cavalos");



}
}


//6- Escreva um programa para determinar a quantidade de cavalos necessários
//  para se levantar uma massa de m quilogramas
//  a uma altura de h metros em t segundos.
//  Considere cavalos = (m * h / t) / 745,6999
