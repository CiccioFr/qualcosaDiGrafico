package enricoagliotti.qualcosadigrafico;

import java.util.HashMap;

/**
 *
 * @author Francesco
 */
public class Istogramma {

    public HashMap<Character, Integer> lettere;

    public Istogramma(HashMap<Character, Integer> lettere) {
        this.lettere = lettere;
    }

    /**
     * Dimensione Istogramma
     * @return [width, height]
     */
    public int[] dimIstogramma(HashMap<Character, Integer> lettere) {
        this.lettere = lettere;
        int width = 0;
        int height = this.lettere.size();

        for (HashMap.Entry<Character, Integer> nr : this.lettere.entrySet()) {
            width = nr.getValue() > width ? nr.getValue() : width;
        }
        
        int[] dim = {width, height};
        return dim;
    }
}