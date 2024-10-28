package ExerciciosOrientacaoAObjetos.Casa.Casa02;

class Cao{
    String nome;
    String raca;
    String somLatido;

    public Cao (String nome, String raca, String somLatido){
        this.nome = nome;
        this.raca = raca;
        this.somLatido = somLatido;
    }

    public void latir (){
        System.out.println(nome + " esta latindo: "+somLatido);
    }
}

class Pessoa{
    String nome;
    int idade;
    Cao pet;

    public Pessoa (String nome, int idade, Cao pet){
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    public void PedirParaCaoLatir (){
        System.out.println(nome + " esta pedindo para " + pet.nome + " latir");
        pet.latir(); 
    }
}

public class C02ex01 {
    public static void main(String[] args) {
        Cao cao1 = new Cao ("Demolidor", "Pintcher", "au au au grrrrrrrgrrr");
        Cao cao2 = new Cao ("Fafá", "Dogue Alemao", "roof rooof rooof");
        Pessoa pessoa1 = new Pessoa ("Joao", 50, cao2);
        Pessoa pessoa2 = new Pessoa ("Sabrino", 35, cao1);
        pessoa1.PedirParaCaoLatir();
        pessoa2.PedirParaCaoLatir();
        System.out.println("Para fins de observação, cada pet latirá sozinho");
        pessoa1.pet.latir();
        pessoa2.pet.latir();
    }
}
