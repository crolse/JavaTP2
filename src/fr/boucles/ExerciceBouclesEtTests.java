package fr.boucles;

public class ExerciceBouclesEtTests {

    private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;



    public static void affichageElement() {


        for (int i = 0 ; i < array.length ; i++){
            System.out.println("affichageElement\n" + array[i]);


        }
    }
    static void affichageElementInverse() {

        for (int i = array.length - 1 ; i >= 0  ; i--){
            System.out.println("affichageElementInverse\n" +array[i]);
        }
    }

    static void affichageEntierSuperieurATrois() {

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > 3) {
                System.out.println("affichageEntierSuperieurATrois\n" +array[i]);
            }

        }
    }

    static void affichageEntierPairs() {

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] % 2 == 0) {
                System.out.println("affichageEntiersPairs\n" +array[i]);
            }

        }
    }
    static void affichageIndexPairs() {

        for (int i = 0 ; i < array.length ; i++){
            if (i % 2 == 0) {
                System.out.println("affichageIndexPairs\n" +array[i]);
            }

        }
    }
    static void affichageEntierImpairs () {

        for (int i = 0 ; i < array.length ; i++){
            if (array [i] % 2 != 0) {
                System.out.println("affichageEntierImPairs\n" +array[i]);
            }

        }
    }





    public static void main(String[] args) {

        affichageElement() ;
        affichageElementInverse();
        affichageEntierSuperieurATrois();
        affichageEntierPairs();
        affichageIndexPairs();
        affichageEntierImpairs();


    }
}
