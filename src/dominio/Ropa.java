package dominio;

public class Ropa {

    public String marca;
    public String tipo;
    public String talla;

    public Ropa(String marca, String tipo, String talla) {
        this.marca = marca;
        this.tipo = tipo;
        this.talla = talla;
    }

    public String toString() {
        return tipo + " " + marca + " " + talla + "\n";
    }
}
