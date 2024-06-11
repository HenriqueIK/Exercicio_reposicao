package Exercicio;

public class Produto implements Comparable<Produto>{
    private String nome;
    private String tipo;
    private double preco;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    @Override
    public int compareTo(Produto e){
        return Double.compare(preco, e.preco);
    }
}