package ExerciciosOrientacaoAObjetos.Casa.Casa01;
import java.util.Scanner;

public class C01ex03 {
    public static void main(String[] args) {
        double saldo;
        double saldo2;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o saldo: ");
        saldo = leitura.nextInt();
        saldo2 = saldo + saldo*0.01;
        System.out.print("Seu saldo atualizado: "+saldo2);
        leitura.close();
    }
}
