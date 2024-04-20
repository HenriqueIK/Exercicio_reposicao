package Senhordosaneis;

public class Habitante {
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;
    public Habitante(String nome, int idade, float energia, Arma arma){
        contador++;
        this.nome = nome;
        this.energia = energia;
        this.id = contador;
        this.idade = idade;
        this.arma = arma;
    }
    public void atacar(){
        if(this.arma.getMagica()){ // se a arma for magica: decrementar 20 da energia
            this.energia -= 20;
        }else{
            this.energia -= 10; // se nao for magica: decrementar 10 da energia
        }
        System.out.println("O Herói " + this.nome + " atacou!");
        System.out.println("========Arma========");
        System.out.println("Nome: " + arma.getNomeArma());
        System.out.println("Mágica: " + arma.getMagica());
    }
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Id: " + this.id);
        System.out.println("Energia: " + this.energia);
    }
}