package fr.boucles;

public class ExerciceBoucleBase {
    static void affichageNombres (){
        for (int i = 1 ; i < 11 ; i++ ) {
            System.out.println(i);
        }
    }

    static void affichageNomPrenom () {
        String prenom = "gregoire" ;
        String nom = "barre" ;

        for (int i = 0 ; i < 20 ; i++ ) {

            System.out.println( nom + prenom);
        }
    }

    static void affichagePairs () {


        for (int i = 2 ; i <= 100 ; i++ ) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void affichageImpairs () {


        for (int i = 1 ; i <= 99 ; i++ ) {
            if ( i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
    affichageNombres () ;
    affichageNomPrenom();
    affichagePairs();
    affichageImpairs();
    }

}



