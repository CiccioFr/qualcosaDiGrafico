package enricoagliotti.qualcosadigrafico;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 *
 * @author Francesco
 */
public class Trova {

    public Trova() {
    }

    public static HashMap<Character, Integer> trovaElencoLettere(String[] args) {
        HashMap<Character, Integer> elencoLettere = new HashMap();
        try {
            String text = Files.readString(Paths.get(args[0]));
            String testo = text.replaceAll("\\s+", "");

            System.out.println("Cerco in: " + testo);
            System.out.println();

            int i = 0;

            while (Character.isDefined(testo.charAt(i)) && i < (testo.length() - 1)) {

                Integer iter = elencoLettere.get(testo.charAt(i)) == null
                        ? 1
                        : elencoLettere.get(testo.charAt(i)) + 1;

                elencoLettere.put(testo.charAt(i), iter);

                System.out.print(testo.charAt(i));

                i++;

            }

            System.out.println("ciao");
            System.out.println("Ho trovato: " + elencoLettere);

            return elencoLettere;

        } catch (Exception e) {
            System.out.println();
            System.out.println(e);
            System.out.println("ECCEZIONE!!\nHo trovato: " + elencoLettere);
        } finally {
        }
        return null;
    }

    public static void trovaParole(String[] args) {
        try {
            String text = Files.readString(Paths.get(args[0]));
            String testo = text.replaceAll("\\s+", "");

            System.out.println();
            String[] paroleNelTesto = text.split("\\w+");
            System.out.println("Lunghezza arrey Split: " + paroleNelTesto.length);

            HashMap<String, Integer> elencoParole = new HashMap();
            for (String string : paroleNelTesto) {
                Integer i = elencoParole.get(string) == null ? 1 : elencoParole.get(string) + 1;
                elencoParole.put(string, i);
            }
            System.out.println(elencoParole);

        } catch (Exception e) {
        } finally {
        }
    }
}
