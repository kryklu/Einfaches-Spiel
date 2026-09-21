import java.util.Random;

public class Model {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public Model() {
        gesamtPunkte = 30;
        spielerZahl = 0;
        computerZahl = 0;
        rundenErgebnis = 0;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getSpielerZahl() {
        return spielerZahl;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berchneComputerZahl(){
        Random random = new Random();
        computerZahl = random.nextInt(9) + 1;
    }

    public void berechneRunde( int spielerZahl){
        this.spielerZahl = spielerZahl;
        int differenz = Math.abs(spielerZahl - computerZahl);
        if(differenz == 0){
            rundenErgebnis = 20;
        }
        if(differenz == 1){
            rundenErgebnis = 5;
        }
        else{
            rundenErgebnis = -10;
        }
        gesamtPunkte = gesamtPunkte + rundenErgebnis;
    }
    public boolean hatGewonnen(){
        if(gesamtPunkte >= 100){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hatVerloren(){
        if(gesamtPunkte <= 0){
            return true;
        }
        else {
            return false;
        }

    }
}
