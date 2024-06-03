package ExEquivalencia;

import java.util.*;

public class Main{
    public static void main(String[] args){

        boolean flag = true;
        Arquivo a = new Arquivo();
        int op;

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = a.ler();

        while(flag){
            System.out.println("Bem-vindo ao sistema GarroSerra!");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Nomes em ordem alfabetica");
            System.out.println("4 - Nomes de Z - A");
            System.out.println("5 - Sair do sistema");

            op = sc.nextInt();

            switch(op){
                case (1):
                    sc.nextLine();
                    System.out.println("Entre com o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Entre com o Cpf: ");
                    String Cpf = sc.nextLine();

                    System.out.println("Entre com o endereço: ");
                    String endereco = sc.nextLine();

                    System.out.println("Entre com a idade: ");
                    int idade = sc.nextInt();

                    Cliente c1 = new Cliente(nome, Cpf, endereco, idade);
                    a.escrever(c1);
                    break;
                case (2):
                    ArrayList<Cliente> clientesi = a.ler();

                    for (int i = 0; i < clientesi.size(); i++){
                        System.out.println("nome: " + clientesi.get(i).getNome());
                        System.out.println("Cpf: " + clientesi.get(i).getCpf());
                        System.out.println("Endereço: " + clientesi.get(i).getEndereco());
                        System.out.println("Idade: " + clientesi.get(i).getIdade());
                    }
                    break;
                case(3):
                    Collections.sort(clientes);

                    for (int i = 0; i < clientes.size(); i++){
                        System.out.println("nome: " + clientes.get(i).getNome());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case (4):
                    Collections.sort(clientes,Collections.reverseOrder());

                    for (int i = 0; i < clientes.size(); i++){
                        System.out.println("nome: " + clientes.get(i).getNome());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case (5):
                    flag = false;
                    break;
            }
        }
    }
}