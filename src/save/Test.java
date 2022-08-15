package save;

import connectors.Http;
import parsers.Jackson;

public class Test {

    public static void main(String[] args) throws Exception {

        Jackson parser = new Jackson();
        Http client = new Http();

        String json = client.buscaDados("https://imdb-api.com/en/API/Top250Movies/k_h2ku7xc7");

        System.out.println(parser.parsear(json).get(9).getFullTitle());
    }

}
