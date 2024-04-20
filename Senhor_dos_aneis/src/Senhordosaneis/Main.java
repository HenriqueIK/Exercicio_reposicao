package Senhordosaneis;

public class Main{
    public static void main(String[] args){
        // criando habitantes para as terras medias
        TerraMedia terraMedia = new TerraMedia();
        Arma arma1 = new Arma();
        arma1.setNomeArma("Machado");
        arma1.setMagica(false);
        Habitante anao = new Anao("Gimli", 50, 300, arma1);

        Arma arma2 = new Arma();
        arma2.setMagica(true);
        arma2.setNomeArma("Adaga Élfica");
        Habitante elfo = new Elfo("Astarion", 27, 100, arma2);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Cajado");
        arma3.setMagica(true);
        Habitante mago = new Mago("Elminster", 90, 700, arma3);

        terraMedia.addHabitante(anao); // colocando habitantes na fila
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);
        terraMedia.listarHabitantes(); // listando habitantes
    }
}