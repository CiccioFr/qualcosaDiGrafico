package enricoagliotti.qualcosadigrafico;

import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
// la classe JComponent è la classe base per la grafica

/**
 *
 * @author Francesco
 */
public class QualcosaDiGrafico {

    public static void main(String[] args) throws IOException {
        System.out.println("Avvia la Grafica: ");

        //HashMap<Character, Integer> lettere = new HashMap(trova.trovaLettere(args));
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // chiude l'applicazione con la chiusura della finestra

        //BarreIstogramma draw = new BarreIstogramma();

        frame.add(new BarreIstogramma(4, 4));
        frame.setVisible(true);
        frame.add(new BarreIstogramma(7, 10));
        frame.setVisible(true);

        //frame.add(draw);

        frame.setVisible(true);

        System.out.println("Fine!!!");
    }

}
