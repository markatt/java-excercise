# java-excercise
Task given:

Aufgabe 1: Welchen Wert enthält die Variable x und welchen Wert enthält die Variable y nach
der Abarbeitung des folgenden Codes:

    int[] array1 = new int[3]; int[] array2;
    array2 = new int[3];
    array1[0] = 6; array1[1] = 7; array1[2] = 8;
    array2[0] = 2; array2[1] = 3;
    array1 = array2;
    int x = array1[1]; int y = array2[1];
    System.out.println(x); System.out.println(y);
Aufgabe 2: Schreiben Sie ein Programm mit drei Methoden:

    a) Schreiben Sie eine Methode erzeugenUndAusfuellen, die ein Array vom Typ int erzeugt
    und das Array mit beliebigen Zahlen ausfüllt.
    b) Schreiben Sie eine zweite Methode maximumZahlFinden, die die größte gespeicherte
    Zahl des Arrays zurückliefert.
    c) Schreiben Sie eine dritte Methode durchschnittRechnen, die den Durchschnitt aller
    Zahlen zurückliefert.

Hinweis: Benutzen Sie die folgenden Anweisungen.

    public class Aufgabe {
        public static void main(String[ ] args) {
            int [ ] x = erzeugenUndAusfuellen ( );
            // TODO ... 
        }
        public static int[ ] erzeugenUndAusfuellen ( ) {
            java.util.Scanner eingabe = new java.util.Scanner ( System.in ); System.out.println("Bitte geben Sie die Anzahl der Zahlen: "); int anzahlVonZahlen = eingabe.nextInt();
            int[ ] zahlen = null;
            // TODO ...
            return zahlen; 
        }
        public static int maximumZahlFinden ( int[ ] zahlen ) { int max = 0;
            // TODO ...
            return max;
        }
        public static double durchschnittRechnen ( int[ ] zahlen ) {
            double durchschnitt = 0; // TODO ...
            return durchschnitt;
        } 
    }
Aufgabe 3: Erweitern Sie die main-Methode der Aufgabe-2 so, dass das Programm immer wieder nachfragt, welche Methode der Benutzer aufrufen möchte.

Hinweis: Als Auswahl könnte man die Zahlen 1,2 und 3 zur Verfügung stellen (z.B: Wenn die Zahl 1 ausgewählt ist, sollte die erstellen-Methode aufgerufen werden).
Sie können die folgenden Programmanweisungen verwenden:

    Scanner eingabe = new Scanner(System.in);
    int[] zahlen = null;
    //TODO ...
    System.out.println("Bitte auswählen: 1, 2 oder 3 "); int wahl = eingabe.nextInt();
    switch( wahl ) {
        case 1: // TODO: erzeugenUndAusfuellen 
        case 2: // TODO: maximumZahlFinden 
        case 3: // TODO: durchschnittRechnen 
        default:// TODO
    }