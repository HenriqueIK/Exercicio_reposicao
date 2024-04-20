package Senhordosaneis;

public class Arma{
    private String nomeArma;
    private boolean magica;
    public void setNomeArma(String nome){
        this.nomeArma = nome;
    }
    public void setMagica(boolean magia){
        this.magica = magia;
    }
    public boolean getMagica(){
        return this.magica;
    }
    public String getNomeArma(){
        return this.nomeArma;
    }
}