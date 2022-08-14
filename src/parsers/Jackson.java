package parsers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import model.Filme;
import model.Items;

public class Jackson {

    public List<Filme> parsear(String json) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Filme> filmes;

        Items items = mapper.readValue(json, new TypeReference<Items>() {
        });

        filmes = items.getItems();

        return filmes;
    }

}
