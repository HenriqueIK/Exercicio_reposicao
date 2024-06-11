package Exercicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Produto p = new Produto();
        Arquivo a = new Arquivo();
        boolean flag = true;

        while (flag){
            // ArrayList auxiliar para ler dados dos produtos
            ArrayList<Produto> produtos = a.ler();

            System.out.println("=== SEJA BEM VINDO AO SISTEMA DE PRODUTOS ===");
            System.out.println("1 - Cadastrar um novo produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Listar produtos em ordem decrescente de preço");
            System.out.println("4 - Listar a quantidade de tipos de produtos");
            System.out.println("5 - Sair do sistema");

            int op = in.nextInt(); // operador para switch
            in.nextLine();

            switch (op){
                case 1:
                    System.out.println("Cadastrar novo produto: ");
                    System.out.print("nome: ");
                    p.setNome(in.nextLine());
                    System.out.print("tipo: ");
                    try{
                        String tipo = in.nextLine(); // adicionando tipo

                        if(tipo.equals("Comida") || tipo.equals("Higiene") || tipo.equals("Decoração")){
                            p.setTipo(tipo);
                        }
                        else{ // se for invalido
                            throw new InfoInvalidaException(tipo);
                        }
                    } catch (InfoInvalidaException e){
                        break; // para o sistema por detectar tipo invalido
                    }
                    System.out.print("preço: ");
                    try{
                        double valor = in.nextDouble(); // adicionando preco

                        if(valor <= 0){ // se for negativo gera invalidacao
                            throw new InfoInvalidaException(valor);
                        }
                        else{
                            p.setPreco(valor); // salvando preço
                        }
                    } catch (InfoInvalidaException e){
                        break;
                    }
                    a.escrever(p); // escrevendo dados no arquivo
                    break;
                case 2:
                    System.out.println("Lista de produtos: "); // mostrando txt
                    for (int i = 0; i < produtos.size(); i++){
                        System.out.println("Informações do produto: "+ (i+1) + ":");
                        System.out.println("\t" + produtos.get(i).getNome());
                        System.out.println("\t" + produtos.get(i).getTipo());
                        System.out.println("\t" + produtos.get(i).getPreco());
                    }
                    break;
                case 3:
                    // ordenando de forma decrescente
                    Collections.sort(produtos, Collections.reverseOrder());

                    System.out.println("Produtos em ordem crescente: ");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Informacoes do produto "+ (i+1) + ":");
                        System.out.println("\t" + produtos.get(i).getNome());
                        System.out.println("\t" + produtos.get(i).getTipo());
                        System.out.println("\t" + produtos.get(i).getPreco());
                    }
                    break;
                case 4:
                    int comida = 0; // variaveis auxiliares para tipos de produto
                    int higiene = 0;
                    int decoracao = 0;

                    System.out.println("Quantidade dos produtos de cada tipo: ");
                    for (int i = 0; i < produtos.size(); i++){
                        if(produtos.get(i).getTipo().equals("Comida")){
                            comida++;
                        }
                        if (produtos.get(i).getTipo().equals("Higiene")){
                            higiene++;
                        }
                        if (produtos.get(i).getTipo().equals("Decoração")){
                            decoracao++;
                        }
                    }
                    System.out.println("\tComida: " + comida);
                    System.out.println("\tHigiene: " + higiene);
                    System.out.println("\tDecoração: " + decoracao);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}