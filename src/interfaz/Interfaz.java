package interfaz;

import dominio.Catalogo;
import dominio.Ropa;

public class Interfaz {

    public static void procesarSentencia(String sentencia) {
        String[] args = sentencia.split(" ");
        Catalogo catalogo = new Catalogo();
        if (args[0].equals("add")) {
            Ropa ropa = new Ropa(args[1], args[2], args[3]);
            catalogo.anadirRopa(ropa);
        }
    }

}
