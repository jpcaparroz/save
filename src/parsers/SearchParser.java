package parsers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import connectors.Http;
import java.util.List;
import model.Filme;
import model.Results;

public class SearchParser {

    public List<Filme> parsear(String filme) throws Exception {
        
        Http client = new Http();
        
        String json = client.buscaDados("https://imdb-api.com/en/API/SearchMovie/k_h2ku7xc7/" + filme);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        List<Filme> filmes;

        Results results = mapper.readValue(json, new TypeReference<Results>() {
        });

        filmes = results.getResults();

        return filmes;
    }

}

