public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    //utilizza la formula A=P*r^2
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    /* DOMANDA 1
    il metodo confronta il valore tra le due aree calcolate e restituisce
    1 se l'area dell'oggetto attuale è maggiore.
    0 se le aree sono uguali.
    -1 se l'area dell'oggetto attuale è minore.

    utile per sapere chi ha l'area maggiore tra due figure*/
    public int compareTo(Circonferenza altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //metodo per restutuire una striga contenente le informazioni della figura
    public String getInformazioni()
    {
        raggio=getRaggio();
        return String.format("Circonferenza di raggio: %.2f ", raggio);
    }
}
