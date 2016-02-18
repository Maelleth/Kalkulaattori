package laskin.laskin;

import javax.swing.SwingUtilities;

public class Main {

    /**
     * Main luokka.
     * @param args Merkkijono taulukko
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Laskin());
    }

}
