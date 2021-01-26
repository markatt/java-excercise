class Aufgabe11 {
    public static void main(String[] args) {
        listeErstellen();
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
        return notenListe;
    }
}