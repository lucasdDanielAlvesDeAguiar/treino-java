import java.util.Scanner;

public class licao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
      
        double alturamaxima = Double.MIN_VALUE;
        double alturaminima = Double.MAX_VALUE;
        double homens = 0;
        int quan_homens = 0;
        int quan_mulheres = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("qual sua altura " + (i + 1) + ": ");
            double altura = teclado.nextDouble();
            
            System.out.print("qual seu sexo " + (i + 1) + " (M/F): ");
            char sexo = teclado.next().charAt(0);
            
            if (altura > alturamaxima) {
                alturamaxima = altura;
            }
            if (altura < alturaminima) {
                alturaminima = altura;
            }
            
            if (sexo == 'M' || sexo == 'm') {
                homens += altura;
                quan_homens++;
            } else if (sexo == 'F' || sexo == 'f') {
                quan_mulheres++;
            }
        }
        
        System.out.println("maior altura: " + alturamaxima);
        System.out.println("menor altura: " + alturaminima);
        
        if (quan_homens > 0) {
            double mediaHomens = homens / quan_homens;
            System.out.println("a média dos homens: " + mediaHomens);
        } else {
            System.out.println("não tem homens para fazer a média");
        }
        
        System.out.println("Número de mulheres: " + quan_mulheres);
        
        teclado.close();
    }
}
        