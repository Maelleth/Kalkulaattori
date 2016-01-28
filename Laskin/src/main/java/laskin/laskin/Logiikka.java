package laskin.laskin;

import javax.swing.JTextField;

public class Logiikka {

    private JTextField ala;
    private JTextField yla;

    public Logiikka(JTextField ala, JTextField yla) {
        this.ala = ala;
        this.yla = yla;
    }

    public void summa() {
        int luku1 = Integer.parseInt(ala.getText());
        int luku2 = Integer.parseInt(yla.getText());
        yla.setText("" + (luku1 + luku2));
        ala.setText("");
    }

    public void erotus() {
        int luku1 = Integer.parseInt(ala.getText());
        int luku2 = Integer.parseInt(yla.getText());
        yla.setText("" + (luku2 - luku1));
        ala.setText("");
    }

    public void nollaus() {
        yla.setText("0");
        ala.setText("");
    }
    
    public void jako() {
        int luku1 = Integer.parseInt(ala.getText());
        int luku2 = Integer.parseInt(yla.getText());
        yla.setText("" + (luku2/luku1));
        ala.setText("");
    }
    
    public void kerto() {
        int luku1 = Integer.parseInt(ala.getText());
        int luku2 = Integer.parseInt(yla.getText());
        yla.setText("" + (luku2*luku1));
        ala.setText("");
    }
    
    public void nelioJuuri() {
        double luku1 = Integer.parseInt(ala.getText());
        yla.setText("" + (Math.sqrt(luku1)));
        ala.setText("");
    }
    
    public void nelio() {
        int luku1 = Integer.parseInt(ala.getText());
        yla.setText("" + (luku1*luku1));
        ala.setText("");
    }
}
