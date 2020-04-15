package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int piece;
        int nbPiece5C = 0;
        int nbPiece10C = 0;
        int nbPiece20C = 0;
        int totalRecu = 0;

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Valeur de la pièce insérée : ");
        piece = lectureClavier.nextInt();

        switch (piece) {
            case 5:
                nbPiece5C = nbPiece5C + 1;
                break;
            case 10:
                nbPiece10C = nbPiece10C + 1;
                break;
            case 20:
                nbPiece20C = nbPiece20C + 1;
                break;
            default:
                piece=0;
                System.out.println("Pièce non reconnue par la machine");
        }
        totalRecu=totalRecu+piece;
        System.out.println("Vous avez inséré: ");
        System.out.println(" "+nbPiece5C+" pièce(s) de 5 centimes");
        System.out.println(" "+nbPiece10C+" pièce(s) de 10 centimes");
        System.out.println(" "+nbPiece20C+" pièce(s) de 20 centimes");
    }
}
