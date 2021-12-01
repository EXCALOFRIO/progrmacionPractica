package interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import dominio.Armario;
import dominio.Ropa;

public class Interfaz {

    private static void inicializarFichero(Armario armario) {

        try (FileWriter fw = new FileWriter("armario.txt")) {
            fw.write(armario.toString());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Armario inicializarCatalogo(String nombreFichero) {
        Armario armario = new Armario();
        File file = new File("armario.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                Ropa ropa = new Ropa(scanner.next(), scanner.next(), scanner.next());
                armario.anadirRopa(ropa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return armario;
    }

    public static void procesarSentencia(String sentencia) {
        String[] args = sentencia.split(" ");
        Armario armario = inicializarCatalogo("armario.txt");
        if (args[0].equals("add")) {
            Ropa ropa = new Ropa(args[1], args[2], args[3]);
            armario.anadirRopa(ropa);
            inicializarFichero(armario);
        }
        if (args[0].equals("armario")) {
            System.out.println(armario);
            inicializarFichero(armario);
        }
    }
}