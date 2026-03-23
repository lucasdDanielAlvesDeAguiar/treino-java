import java.util.Scanner;

public class licao3 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.print("quantos funcionarios são?: ");
        double funcionarios = teclado.nextDouble();
        double salario = 0;
        double salarioTotal = 0;

        if (funcionarios > 0) {
            for (int i = 0; i < funcionarios; i++) {
                System.out.print("qual o salario do funcionario " + (i + 1) + ": ");
                salario = teclado.nextDouble();
                salarioTotal += salario;
            }
            double mediaSalarios = salarioTotal / funcionarios;
            System.out.println("a média dos salarios: " + mediaSalarios);
        } else {
            System.out.println("não tem funcionarios para calcular a média");
        }
    }
}
