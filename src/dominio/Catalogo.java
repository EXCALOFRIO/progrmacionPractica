package dominio;

import java.util.ArrayList;

public class Catalogo {

    private static ArrayList<Ropa> armario = new ArrayList<>();

    public static void anadirRopa(Ropa ropa) {
        armario.add(ropa);
        for (int i = 0; i < armario.size(); i++){
            System.out.println(i + " "+ armario.get(i));
        }
    }
}
