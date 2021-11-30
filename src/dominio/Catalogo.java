package dominio;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Ropa> armario = new ArrayList<>();

    public void anadirRopa(Ropa ropa) {
        armario.add(ropa);
    }
}
