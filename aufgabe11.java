import java.util.Random;

class Aufgabe11 {
    public static void main(String[] args) {
        int[][] liste = listeErstellen();
        listeAusgeben(liste);
    }

    public static int[][] listeErstellen() {
        java.util.Scanner eingabe = new java.util.Scanner(System.in);

        int dimension = eingabe.nextInt();

        int[][] notenListe = new int[dimension][2];

        eingabe.close();

        /**
         * @TODO
         * Add Random nums 100000 999999 to fill 1st column
         * Add Random grades from 1 to 6 to fill 2nd column
         */

        for(int i = 0; i < notenListe.length ; i++) {
            Random randNum = new Random();

            notenListe[i][0] = randNum.nextInt((1000000 - 100000) + 1) - 100000;

            notenListe[i][1] = randNum.nextInt(7);
         
        }
        return notenListe;
    }

    public static void listeAusgeben(int[][] liste){
        for(int i = 0; i < liste.length; i++) {
            System.out.println("Matrikelnummer: " + liste[i][0]);
            System.out.println("Note: " + liste[i][1]);
        }
    }
}