import Caneta.Caneta;
import java.util.Scanner;

public class EstudoPOO {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
                c1.status();
        System.out.println("_____________________________");
        Caneta c2 = new Caneta("Compact", "Preta", 1.5f);
                c2.status();
    }

}