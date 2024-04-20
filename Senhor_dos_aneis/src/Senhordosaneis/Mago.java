package Senhordosaneis;

public class Mago extends Habitante implements Cura, Feitico{
    private String cor;
    public Mago(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }
    @Override
    public void lancarFeitico(){
        System.out.println("O Mago "+this.nome+ " lançou um feitiço!");
        this.energia = this.energia * 0.9f; // decrementando 10% de energia quando lanca feitiço
    }
    @Override
    public void curar(){
        this.energia = this.energia * 1.15f; // incrementando 15% de energia quando for curado
        System.out.println("Herói " +this.nome+ " foi curado!");
    }
}
