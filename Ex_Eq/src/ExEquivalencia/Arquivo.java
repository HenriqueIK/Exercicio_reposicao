package ExEquivalencia;

import java.io.*;
import java.util.ArrayList;

public class Arquivo{
    public void escrever(Cliente c){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linha;

        try{
            os = new FileOutputStream("Cliente.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("++ Cliente ++\n");
            bw.write(c.getNome() + "\n");
            bw.write(c.getCpf() + "\n");
            bw.write(c.getEndereco() + "\n");
            bw.write(c.getIdade() + "\n");
        }catch(Exception e){
            System.out.println("ERRO: " + e);
        }finally{
            try{
                bw.close();
            }catch(Exception e){}
        }
    }
    public ArrayList<Cliente> ler(){
        ArrayList<Cliente> encontrei = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linha2;

        try{
            is = new FileInputStream("Clientes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha2 = br.readLine();

            while(linha2 != null){
                if (linha2.contains("++ Clientes ++")){
                    Cliente c1 = new Cliente();
                    c1.setNome(br.readLine());
                    c1.setCpf(br.readLine());
                    c1.setEndereco(br.readLine());
                    c1.setIdade(Integer.parseInt(br.readLine()));
                    encontrei.add(c1);
                }
                linha2 = br.readLine();
            }
        }catch(Exception e){
        }finally{
            try{
                br.close();
            } catch(Exception e){}
        }
        return encontrei;
    }
}