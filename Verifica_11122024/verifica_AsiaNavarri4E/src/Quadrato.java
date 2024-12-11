public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    //utilizza la formula A=l*l
    public double calcolaArea() {
        return lato * lato;
    }

    /* DOMANDA 1
    il metodo confronta il valore tra le due aree calcolate e restituisce
    1 se l'area dell'oggetto attuale è maggiore.
    0 se le aree sono uguali.
    -1 se l'area dell'oggetto attuale è minore.

    utile per sapere chi ha l'area maggiore tra due figure*/
    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //metodo per restutuire una striga contenente le informazioni della figura
    public String getInformazioni()
    {
        lato=getLato();
        return String.format("Quadrato di lato: %.2f", lato);
    }
}