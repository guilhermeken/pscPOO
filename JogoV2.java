import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        Personagem cacador = new Personagem(10,0,0);
        Personagem soneca = new Personagem(2,4,9);
        Random gerador = new Random();
        cacador.nome = "Caçador";
        soneca.nome = "Soneca";
            while(true){
                int oQueFazerCacador = gerador.nextInt(3) + 1;
                int oQueFazerSoneca = gerador.nextInt(3)+1;
                switch(oQueFazerSoneca){
                    case 1:
                    soneca.cacar();
                        break;
                    case 2:
                    soneca.comer();
                        break;
                    case 3:
                    soneca.dormir();
                        break;
                }
                switch(oQueFazerCacador){
                    case 1:
                    cacador.cacar();
                        break;
                    case 2:
                    cacador.comer();
                        break;
                    case 3:
                    cacador.dormir();
                        break;
                }
                System.out.println("Caçador");
                cacador.variaveis();
                System.out.println("=======================================================================================================");
                System.out.println("Soneca");
                soneca.variaveis();
                System.out.println("=======================================================================================================");
                Thread.sleep(5000);
            }
    }
}
