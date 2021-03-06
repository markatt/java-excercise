package uebung11;

import java.util.InputMismatchException;
import java.util.Random;

class Aufgabe11 {
    public static void main(String[] args) {
            try {
                int[][] liste = listeErstellen();
                listeAusgeben(liste);
                besteNoteAusgeben(liste);
    
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie nur ganze Zahlen an.");
            }
    }

    public static int[][] listeErstellen() {
        java.util.Scanner eingabe = new java.util.Scanner(System.in);
        System.out.println("Wie lang soll ihre Liste sein (Zeilen)?");
        int dimension = eingabe.nextInt();
        //Create an multidimensional Array with 2 columns and n rows
        int[][] notenListe = new int[dimension][2];

        eingabe.close();

        /**
         * @Bug still generates Numbers less than 6-digits
         */

        for(int i = 0; i < notenListe.length ; i++) {
            Random randNum = new Random();
            //Generating 6-digit Student-Id
            notenListe[i][0] = randNum.nextInt((999999 - 100000) + 100000);
            //Generating grade from 1 to 6
            notenListe[i][1] = randNum.nextInt(7) + 1;
         
        }
        return notenListe;
    }

    public static void listeAusgeben(int[][] liste){
        for(int i = 0; i < liste.length; i++) {
            /**
             * Print only filled array values
             */
            if(liste[i][1] != 0) {
                System.out.println("Matrikelnummer: " + liste[i][0]);
                System.out.println("Note: " + liste[i][1]);
            }
        }
    }

    public static void besteNoteAusgeben(int[][] liste){
        //Initialize bestGrade Array with length of passed in list
        int [][] bestGrade = new int [liste.length][2];

        bestGrade[0][0] = liste[0][0];
        bestGrade[0][1] = liste[0][1]; 

        /**
         * Check for best Grade
         *
         */
        for(int i = 1; i < liste.length; i++) {
            if(bestGrade[0][1] > liste[i][1]){
                bestGrade[0][0] = liste[i][0];
                bestGrade[0][1] = liste[i][1];
            // If there are more best grades they get pushed into the array, too
            } else if(bestGrade[0][1] == liste[i][1]){
                bestGrade[bestGrade.length - 1][0] = liste[i][0];
                bestGrade[bestGrade.length - 1][1] = liste[i][1];
            }
        }

        System.out.println("\n\nDie Beste Note ist/sind: ");
        listeAusgeben(bestGrade);
    }
}