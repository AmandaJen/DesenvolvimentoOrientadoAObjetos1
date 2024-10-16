package ExerciciosOrientacaoAObjetos.Casa.Casa01;
import java.util.Scanner;

public class C01ex01 {
    public static void main(String[] args) {
        int totalDias;
        Scanner leitura = new Scanner(System.in);       //Scanner para leitura de entrada do usuário
        System.out.println("Bem-vindo ao programa que calcula a idade");
        System.out.print("Informe a quantidade de anos: ");
        int anos = leitura.nextInt();
        System.out.print("Informe a quantidade de meses: ");
        int meses = leitura.nextInt();
        System.out.print("Informe a quantidade de dias: ");
        int dias = leitura.nextInt();
        totalDias = (anos * 365) + (meses * 30) + dias;     // Calcula o total de dias
        System.out.println("A idade expressa em dias é: " + totalDias);
        leitura.close();
    }
}