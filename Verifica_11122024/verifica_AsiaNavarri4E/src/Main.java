// Asia Navarri 4E 11/12/2024

/*
Costruttori: spiegate il loro scopo e quali parametri si aspettano.
Metodi di calcolo (ad esempio, calcolaArea o calcolaPerimetro): descrivete brevemente il ragionamento dietro le formule utilizzate.
Metodi complessi (ad esempio, compareTo o distanza): spiegate cosa fanno e perché sono utili.

Che devi fare?
Correggi il main, se occorre:
Controlla bene il  metodo getInformazioni() e vedi come risolvere il problema dello stampare info e fare andare bene il compareTo.
 */
public class Main {
    public static void main(String[] args) {
        //creazione figure attraverso i metodi costruttori (si occupano di istanziare un nuovo oggetto e assegnare i valori agli attributi)
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);

        //stampa informazioni figure
        System.out.println(rettangolo.getInformazioni());
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());

        /*parte non terminata
        if (rettangolo.compareTo(quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area minore del quadrato.");
        }
        else
        {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }*/
    }
}