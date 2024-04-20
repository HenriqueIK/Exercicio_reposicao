package Senhordosaneis;

public class Elfo extends Habitante implements Cura{
    private String tribo;
    public Elfo(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }
    public void setTribo(String tribo){
        this.tribo = tribo;
    }
    public void viajar(){
        System.out.println("O Elfo " + this.nome + " está viajando");

    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: " + this.tribo);
    }
    @Override
    public void curar(){
        this.energia = this.energia * 1.15f; // incrementando 15% de energia quando for curado
        System.out.println("Herói " + this.nome + " foi curado!");
    }
}
