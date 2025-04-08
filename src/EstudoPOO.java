import Caneta.Caneta;
import java.lang.classfile.instruction.LocalVariable;
import java.util.Scanner;
import java.util.Locale;

    public class EstudoPOO {

        Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Caneta c1 = new Caneta();

            c1.modelo = "Bic Cristal";
            c1.cor = "Azul";
            c1.ponta = 0.5f;
            c1.carga = 90;

            c1.destampar();
            c1.status();
            c1.rabiscar();
        }



}
