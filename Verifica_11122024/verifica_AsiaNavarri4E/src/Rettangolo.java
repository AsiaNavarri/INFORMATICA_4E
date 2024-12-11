public class Rettangolo {
    private double base;
    private double altezza;

    //metodo costruttore rettangolo
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //metodi get e set per la base e l'altezza
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //metodo che calcola l'area
    //utilizza la formula A=b*h
    public double calcolaArea() {
        return base * altezza;
    }

    /* DOMANDA 1
    il metodo confronta il valore tra le due aree calcolate e restituisce
    1 se l'area dell'oggetto attuale è maggiore.
    0 se le aree sono uguali.
    -1 se l'area dell'oggetto attuale è minore.

    utile per sapere chi ha l'area maggiore tra due figure*/
    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //metodo per restutuire una striga contenente le informazioni della figura
    public String getInformazioni()
    {
        base=getBase();
        altezza=getAltezza();
        return String.format("Rettangolo di base: %.2f altezza: %.2f ", base, altezza);
    }
}