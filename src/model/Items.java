package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {

    private List<Filme> items;

    public List<Filme> getItems() {
        return items;
    }

    public void setItems(List<Filme> items) {
        this.items = items;
    }

}
