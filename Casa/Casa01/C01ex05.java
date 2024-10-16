package ExerciciosOrientacaoAObjetos.Casa;
import java.util.Scanner;

public class C01ex05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double salario;
        double salariominimo; //1=788
        System.out.print("Digite seu salario para ver quandos salarios minimos: ");
        salario = leitura.nextInt();
        salariominimo = salario/788;
        System.out.println("A quantidade de salarios minimos que tem: "+salariominimo);
        leitura.close();
    }
}
