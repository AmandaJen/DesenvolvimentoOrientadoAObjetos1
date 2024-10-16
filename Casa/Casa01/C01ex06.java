package ExerciciosOrientacaoAObjetos.Casa;
import java.util.Scanner;

public class C01ex06 {
    public static void main(String[] args) {
        int numero;
        int sucessor;
        int antecessor;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero para descobrir seu sucessor e antecessor: ");
        numero = leitura.nextInt();
        sucessor=numero+1;
        antecessor=numero-1;
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        leitura.close();
    }
}
