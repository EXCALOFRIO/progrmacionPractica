package dominio;

public class Ropa {

    private String marca;
    private String tipo;
    private String talla;

    public Ropa(String marca, String tipo, String talla) {

    }

    public String toString() {
        return tipo + " " + marca + " " + talla + "\n";
    }
}
