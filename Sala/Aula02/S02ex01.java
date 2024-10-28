package ExerciciosOrientacaoAObjetos.Sala.Aula02;

class Carro{
    int ano;
    String marca;
    String modelo;
    String cor;
    
    public Carro(int ano, String marca, String modelo, String cor) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public void exibirModelo (){
        System.out.println("Modelo: "+modelo);
    }

    public void exibirMarca(){
        System.out.println("Marca: "+marca);
    }
    
    public void exibirAnoECor(){
        System.out.println ("Ano: "+ano);
        System.out.println ("Cor: "+cor);
    }
}

public class S02ex01 {
  public static void main(String args[]) {
        Carro carro1 = new Carro (1980, "VW", "Fusca", "Azul");
        Carro carro2 = new Carro(2000, "Ford", "Fiesta", "Vermelho");
        Carro meucarro = new Carro (2020, "Renault", "Oroch", "Prata");
        System.out.println("Informacoes carro 1:");
        carro1.exibirModelo();
        carro1.exibirMarca();
        carro1.exibirAnoECor();
        System.out.println(" ");
        System.out.println("Informacoes carro 2:");
        carro2.exibirModelo();
        carro2.exibirMarca();
        carro2.exibirAnoECor();
        System.out.println(" ");
        System.out.println("Informacoes do meu carro:");
        meucarro.exibirModelo();
        meucarro.exibirMarca();
        meucarro.exibirAnoECor();

  }
}