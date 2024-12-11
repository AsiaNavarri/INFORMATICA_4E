/*  DOMANDA 2
    Scrivi una classe chiamata Punto con i seguenti attributi e metodi:

    Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
    Un costruttore che accetta come parametri i valori di x e y.
    Metodi getter e setter per gli attributi.
    Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra
    il punto corrente e un altro punto passato come parametro.
 */
public class Punto {
    private double x;
    private double y;

    //metodo costruttore per un punto
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metodi get e set per le coordinate
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*metodo per il calcolo della distanza tra due punti (al quadrato)
      utilizzata la formula d^2=(x1-x2)^2 + (y1-y2)^2
      utile per esempio per calcolare la lunghezza di un lato dati i due estremi
     */
    public double distanza(Punto altro)
    {
        double d= (this.x-altro.x)*(this.x-altro.x)+(this.y-altro.y)*(this.y-altro.y);
        return d;
    }

}
