package fr.boucles;

public class ExerciceTableauEntier {

    private static int[] tableauEntier ={1 ,2,3,4,5,6,7,8,9,10};



    static void affichageTableau() {

        System.out.println(tableauEntier[0]) ;


    }
    static void tailleTableau() {

        System.out.println(tableauEntier.length) ;
    }

    public static void affichageDernierElement () {

        int taille = tableauEntier.length ;
        System.out.println(tableauEntier[taille - 1]) ;
    }
    public static void modifierElement () {

        tableauEntier[4] = 8 ;
        System.out.println(tableauEntier[4]) ;
    }

    public static void main(String[] args) {
        affichageTableau();
        tailleTableau();
        affichageDernierElement();
        modifierElement();
    }




}
