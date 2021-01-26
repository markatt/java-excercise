class Aufgabe11 {
    public static void main(String[] args) {
        listeErstellen();
    }

    public static int[][] listeErstellen() {
        java.util.Scanner eingabe = new java.util.Scanner(System.in);

        int dimension = eingabe.nextInt();

        int[][] notenListe = new int[dimension][2];

        eingabe.close();
        return notenListe;
    }
}