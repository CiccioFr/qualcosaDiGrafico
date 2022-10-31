package enricoagliotti.qualcosadigrafico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JComponent;

/**
 *
 * @author WS2
 */
public class BarreIstogramma extends JComponent{
    // ridefinisco il metodo paintComponent, che è chiamato automaticamente 
    
    private HashMap<Character, Integer> lettere;
    
    int indice;
    int valore;
    private final int LARGHEZZA = 10;

    public BarreIstogramma(HashMap<Character, Integer> lettere, int indice, int valore) {
        this.lettere = lettere;
        this.indice = indice;
        this.valore = valore;
    }

    public BarreIstogramma(int indice, int valore) {
        this.indice = indice;
        this.valore = valore;
    }
    
    //Trova elencoLettere= new Trova();
    
    Istogramma istogramma = new Istogramma(lettere);
//    Istogramma.

    protected void setDimensione(int[] dimIstogramma) {
//        this.dimIstogramma = dimIstogramma;
    }

    @Override
    protected void paintComponent(Graphics g) {
        // g sarebbe la penna con cui faccio il disegno
        Rectangle rect = g.getClipBounds();
        System.out.println(rect);
        g.setColor(Color.orange);
//        g.fillRect(10, 10, dimIstogramma[0], dimIstogramma[1]);
    }

}

// pw wifi: cirmione215 opp cunione61215