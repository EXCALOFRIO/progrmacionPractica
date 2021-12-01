package dominio;

import java.util.ArrayList;

public class Armario {

    private ArrayList<Ropa> armarioRopa = new ArrayList<>();

    public void anadirRopa(Ropa ropa) {
        armarioRopa.add(ropa);

    }

    public String toString() {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < armarioRopa.size(); i++) {
            data.append(armarioRopa.get(i));
        }
        return data.toString();
    }
}
