package save;

import java.util.List;
import model.Filme;
import parsers.SearchParser;

public class Test {

    public static void main(String[] args) throws Exception {

        SearchParser parser = new SearchParser();
        
        List<Filme> listaFilmes;
        
        listaFilmes = parser.parsear("vingadores");
        
        System.out.println(listaFilmes.get(0).getTitle());
        
        
        
        
    }

}
