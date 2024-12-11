public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

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

    //utilizza la formula A=(b*h)/2
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    /* DOMANDA 1
    il metodo confronta il valore tra le due aree calcolate e restituisce
    1 se l'area dell'oggetto attuale è maggiore.
    0 se le aree sono uguali.
    -1 se l'area dell'oggetto attuale è minore.

    utile per sapere chi ha l'area maggiore tra due figure*/
    public int compareTo(TriangoloRettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //metodo per restutuire una striga contenente le informazioni della figura
    public String getInformazioni()
    {
        base=getBase();
        altezza=getAltezza();
        return String.format("Triangolo Rettandolo di base: %.2f altezza: %.2f ", base, altezza);
    }
}
