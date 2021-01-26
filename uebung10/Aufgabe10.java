package uebung10;

import java.util.Random;

public class Aufgabe10 {
    public static void main(String[ ] args) {
        java.util.Scanner menueEingabe = new java.util.Scanner(System.in);
        int [] arr = null;
        int auswahl;
        do {
            System.out.println("\n\nMenüpunkt auswählen: ");
            System.out.println("1. Array erzeugen und Füllen");
            System.out.println("2. Größte Zahl finden");
            System.out.println("3. Durchschnitt berechnen");
            System.out.println("4. Programm beenden \n\n\n");

            auswahl = menueEingabe.nextInt();
            switch(auswahl){
                case 1:
                    arr = erzeugenUndAusfuellen();
                    break;
                case 2:
                    maximumZahlFinden(arr);
                    break;
                case 3:
                    durchschnittRechnen(arr);
                    break;
                case 4:
                    auswahl = 5;
                    System.out.println("Programm wird beendet");
                
            }
           
        } while (auswahl < 4 );

    }
    public static int[ ] erzeugenUndAusfuellen ( ) {
        Random randomNum = new Random();
        java.util.Scanner eingabe = new java.util.Scanner ( System.in ); 
        System.out.println("Bitte geben Sie die Anzahl der Zahlen: ");

        int anzahlVonZahlen = eingabe.nextInt();

        System.out.println("Sie haben: " + anzahlVonZahlen + " eingegeben");

        int[ ] zahlen = new int[anzahlVonZahlen];
        
        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = randomNum.nextInt(50);
        }
        return zahlen; 
    }
    public static int maximumZahlFinden ( int[ ] zahlen ) { 
        int max = 0;
        
        for(int i = 0; i < zahlen.length; i++) {
            if(max <= zahlen[i]){
                max = zahlen[i];
            }
        }
        
        System.out.println("Die größte Zahl beträgt: " + max);
        return max;
    }
    public static double durchschnittRechnen ( int[ ] zahlen ) {
        double durchschnitt = 0;
        double summe = 0; 

        for(int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }

        durchschnitt = summe / zahlen.length;
        System.out.println("Der Durchschnitt beträgt: " + durchschnitt);

        return durchschnitt;
    } 
}