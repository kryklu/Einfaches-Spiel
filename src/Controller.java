import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;

        view.getTxtSpielerzahl().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        view.getbButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void rundeAuswerten(){
        String eingabe = view.getTxtSpielerzahl().getText();
        int spielerZahl;
        try {
            spielerZahl = Integer.parseInt(eingabe);
        }
        catch (NumberFormatException e){
            return;
        }
        if(spielerZahl < 1 || spielerZahl > 9){
            return;
        }

        model.berchneComputerZahl();
        model.berechneRunde(spielerZahl);

        view.getTxtComputerzahl().setText(String.valueOf(model.getComputerZahl()));
        view.getLblGesamtpunkte().setText("Gesamtpunkte: " + model.getGesamtPunkte());
        view.getLblRundenergebnis().setText("Ergebnis: " + model.getRundenErgebnis());
        Color farbe;

        if(model.getRundenErgebnis() < 0 || model.hatVerloren()){
            farbe = Color.red;
        }
        else if (model.hatGewonnen() || model.getRundenErgebnis() > 0){
            farbe = Color.green;
        }
        else{
            farbe = Color.white;
        }

        view.getLblGesamtpunkte().setBackground(farbe);
        view.getLblRundenergebnis().setBackground(farbe);
    }


}
