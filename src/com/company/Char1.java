package com.company;

import java.util.Scanner;

public class Char1 {
    /**
     * Permet de construire le combattant du joueur 1
     */
    public static void creatChar1(){

        Scanner sc = new Scanner(System.in);
        Char char1 = new Char(0, 0, 0, 0, 0, 0);

        System.out.println("Création du personnage du Joueur 1");
        System.out.println("Veuillez choisi la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        int types = sc.nextInt();
        char1.setTypes(types);

        //Choix du niveau du joueur 1
        System.out.println("Niveau du personnage ?");
        int level = sc.nextInt();
        char1.setLevel(level);

        //Choix de la force du joueur 1
        System.out.println("Force du personnage ?");
        int str = sc.nextInt();
        char1.setStr(str);

        //Choix de l'agilité du joueur 1
        System.out.println("Agilité du personnage ?");
        int dex = sc.nextInt();
        char1.setDex(dex);

        //Choix de l'intelligence du joueur 1
        System.out.println("Intelligence du personnage");
        int intell = sc.nextInt();
        char1.setIntell(intell);

        //Affichage des caractéristique du joueur 1
        System.out.println("............ je suis le " + char1.getTypesName() + " " + char1.getLevel() + " je possède " + char1.getHp() + " de vitalité, " + char1.getStr() + " d'agilité et " + char1.getIntell() + " d'intelligence");
    }
}
