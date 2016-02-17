package laskin.laskin;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Luokka sisältää laskimen ulkoasun.
 */
public class Laskin implements Runnable {

    private JFrame frame;

    public Laskin() {

    }

    @Override
    public void run() {
        frame = new JFrame("Laskin");
        frame.setLayout(new GridLayout(4, 1));
        frame.setPreferredSize(new Dimension(300, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JTextField tulosKentta = new JTextField();
        tulosKentta.setText("0");
        tulosKentta.setEnabled(false);
        container.add(tulosKentta);
        JTextField syoteKentta = new JTextField();
        container.add(syoteKentta);

        container.add(luoLaskuValikko(tulosKentta, syoteKentta));
        container.add(luoMuunninValikko(tulosKentta, syoteKentta));
    }

    private JPanel luoLaskuValikko(JTextField kentta1, JTextField kentta2) {
        JPanel paneeli = new JPanel(new GridLayout(3, 3));
        JButton summa = new JButton("+");
        JButton erotus = new JButton("-");
        JButton nollaus = new JButton("0");
        nollaus.setEnabled(false);
        JButton jako = new JButton("/");
        JButton kerto = new JButton("*");
        JButton nelioJuuri = new JButton("√");
        JButton nelio = new JButton("x²");
        JButton logaritmi = new JButton("log");
        JButton kertoma = new JButton("!");

        Laskunapinkuuntelija laskukuuntelija = new Laskunapinkuuntelija(kentta1, kentta2, summa, erotus, nollaus, jako, kerto, nelioJuuri, nelio, logaritmi, kertoma);

        paneeli.add(summa);
        paneeli.add(erotus);
        paneeli.add(nollaus);
        paneeli.add(jako);
        paneeli.add(kerto);
        paneeli.add(nelioJuuri);
        paneeli.add(nelio);
        paneeli.add(logaritmi);
        paneeli.add(kertoma);
        
        summa.addActionListener(laskukuuntelija);
        erotus.addActionListener(laskukuuntelija);
        nollaus.addActionListener(laskukuuntelija);
        jako.addActionListener(laskukuuntelija);
        kerto.addActionListener(laskukuuntelija);
        nelioJuuri.addActionListener(laskukuuntelija);
        nelio.addActionListener(laskukuuntelija);
        logaritmi.addActionListener(laskukuuntelija);
        kertoma.addActionListener(laskukuuntelija);

        return paneeli;
    }
    
    private JPanel luoMuunninValikko(JTextField kentta1, JTextField kentta2) {
        JPanel paneeli = new JPanel(new GridLayout(2, 3));
        JButton cF = new JButton("C(F)");
        JButton cK = new JButton("C(K)");
        JButton fC = new JButton("F(C)");
        JButton fK = new JButton("F(K)");
        JButton kC = new JButton("K(C)");
        JButton kF = new JButton("K(F)");
        
        Muuntimenkuuntelija muunninkuuntelija = new Muuntimenkuuntelija(kentta1, kentta2, cF, cK, fC, fK, kC, kF);
        
        paneeli.add(cF);
        paneeli.add(cK);
        paneeli.add(fC);
        paneeli.add(fK);
        paneeli.add(kC);
        paneeli.add(kF);
        
        cF.addActionListener(muunninkuuntelija);
        cK.addActionListener(muunninkuuntelija);
        fC.addActionListener(muunninkuuntelija);
        fK.addActionListener(muunninkuuntelija);
        kC.addActionListener(muunninkuuntelija);
        kF.addActionListener(muunninkuuntelija);
        
        return paneeli;
    }

    public JFrame getFrame() {
        return frame;
    }

}
