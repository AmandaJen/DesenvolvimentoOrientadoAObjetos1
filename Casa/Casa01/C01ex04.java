package ExerciciosOrientacaoAObjetos.Casa.Casa01;
import java.util.Scanner;

public class C01ex04 {
     public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe a porcentagem do IPI: ");
        double ipi = leitura.nextDouble();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorpeca1 = leitura.nextDouble();
        System.out.print("Informe a quantidade da peça 1: ");
        int qntpeca1 = leitura.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorpeca2 = leitura.nextDouble();
        System.out.print("Informe a quantidade da peça 2: ");
        int qntpeca2 = leitura.nextInt();
        double total = (valorpeca1 * qntpeca1 + valorpeca2 * qntpeca2) * (ipi / 100 + 1);
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", total);
        leitura.close();
    }
}
