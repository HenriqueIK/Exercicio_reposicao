package Exercicio;

public class InfoInvalidaException extends Exception{
    public InfoInvalidaException(String tipo){
        System.out.println("produto " + tipo + " nao encontrado");
    }
    public InfoInvalidaException(double valor){
        System.out.println("valor: " + valor + " invalido");
    }
}