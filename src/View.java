import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JLabel lblGesamtpunkte;
    private JLabel lblRundenergebnis;
    private JTextField txtSpielerzahl;
    private JTextField txtComputerzahl;
    private JButton bButton;

    public View(){
        setTitle("Zahlen-Gewinnspiel");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // oben: zwei Labels fuer Gesamtpunkte und Rundenergebnis
        JPanel oben = new JPanel(new GridLayout(1, 2, 5, 5));
        lblGesamtpunkte = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);
        lblRundenergebnis = new JLabel("Ergebnis: -", SwingConstants.CENTER);
        lblGesamtpunkte.setOpaque(true);
        lblRundenergebnis.setOpaque(true);
        lblGesamtpunkte.setBackground(Color.WHITE);
        lblRundenergebnis.setBackground(Color.WHITE);
        oben.add(lblGesamtpunkte);
        oben.add(lblRundenergebnis);

        // mitte: Eingabe der Spielerzahl und Anzeige der Computerzahl
        JPanel mitte = new JPanel(new GridLayout(2, 2, 5, 5));
        mitte.add(new JLabel("Deine Zahl (1-9):"));
        txtSpielerzahl = new JTextField();
        mitte.add(txtSpielerzahl);

        mitte.add(new JLabel("Computerzahl:"));
        txtComputerzahl = new JTextField();
        txtComputerzahl.setEditable(false);
        mitte.add(txtComputerzahl);

        // unten: Button "Noch einmal!"
        bButton = new JButton("Noch einmal!");
        bButton.setEnabled(false);

        add(oben, BorderLayout.NORTH);
        add(mitte, BorderLayout.CENTER);
        add(bButton, BorderLayout.SOUTH);

    }

    public JLabel getLblGesamtpunkte(){
        return lblGesamtpunkte;
    }
    public JLabel getLblRundenergebnis(){
        return lblRundenergebnis;
    }
    public JTextField getTxtSpielerzahl(){
        return txtSpielerzahl;
    }
    public JTextField getTxtComputerzahl(){
        return txtComputerzahl;
    }
    public JButton getbButton(){
        return bButton;
    }
}
