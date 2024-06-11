package Exercicio;

import java.util.ArrayList;
import java.io.*;

public class Arquivo{
    public void escrever(Produto produto){

        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        try{
            os = new FileOutputStream("Produtos.txt", true); // abrindo saida de dados
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("=====PRODUTO=====\n");
            bw.write(produto.getNome() + "\n");
            bw.write(produto.getTipo() + "\n");
            bw.write(produto.getPreco() + "\n");
        }catch (Exception e){
            System.out.println("erro " + e);
        }finally{
            try{
                bw.close();
            }catch (Exception e){
            }
        }
    }
    public ArrayList<Produto> ler(){

        ArrayList<Produto> encontrei = new ArrayList<>();

        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        String aux; // variavel auxiliar

        try{
            // Instanciando os objetos
            is = new FileInputStream("Produtos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            aux = br.readLine();

            while (aux != null){
                if (aux.contains("++ PRODUTO ++")){
                    Produto p1 = new Produto();

                    p1.setNome(br.readLine());
                    p1.setTipo(br.readLine());
                    p1.setPreco(Double.parseDouble(br.readLine()));

                    encontrei.add(p1);
                }
                aux = br.readLine();
            }
        }catch (Exception e){
        }finally{
            try{
                br.close();
            }catch (Exception e){
            }
        }
        return encontrei;
    }
}