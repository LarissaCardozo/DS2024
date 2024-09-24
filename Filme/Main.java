
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {  
    	
        ArrayList<Conteudo> catalogoFilme = new ArrayList<>();
        catalogoFilme.add(new Filme("Passageiros", 116));
        catalogoFilme.add(new Filme("Jogos Vorazes", 142));
        catalogoFilme.add(new Filme("Um Olhar do Paraiso", 135));
        catalogoFilme.add(new Filme("Interestelar", 169));
        catalogoFilme.add(new Filme("A Origem", 148));
        
        ArrayList<Conteudo> catalogoSerie = new ArrayList<>();
        catalogoSerie.add(new Serie("Breaking Bad", 45, 62, 5));
        catalogoSerie.add(new Serie("The Mentalist", 43, 102, 7));
        catalogoSerie.add(new Serie("Friends", 22, 236, 10));
        catalogoSerie.add(new Serie("Game of Thrones", 60, 73, 8));
        catalogoSerie.add(new Serie("The Office", 22, 201, 9));
 
      
        for (Conteudo conteudo : catalogoFilme) {
            conteudo.descricao();
        }
        System.out.println("--------------------------------------------|-------------------------------------------");
        for (Conteudo conteudo : catalogoSerie) {
            conteudo.descricao();
        }
        
    }
}