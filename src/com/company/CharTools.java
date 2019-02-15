package com.company;

import java.util.Scanner;

public class CharTools {

    public void creatCharTools() {

        Scanner sc = new Scanner(System.in);

        Char char1 = new Char(0,0,0,0,0,0);
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
        System.out.println("............ je suis le " +char1.getTypes()+" " +char1.getLevel()+" je possède "+char1.getHp()+" de vitalité, " +char1.getStr()+ " d'agilité et " +char1.getIntell()+ " d'intelligence");

        Char char2 = new Char(0,0,0,0,0,0);
        System.out.println("Création du personnage du Joueur 1");
        System.out.println("Veuillez choisi la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        types = sc.nextInt();
        char2.setTypes(types);

        //Choix du niveau du joueur 1
        System.out.println("Niveau du personnage ?");
        level = sc.nextInt();
        char2.setLevel(level);

        //Choix de la force du joueur 1
        System.out.println("Force du personnage ?");
        str = sc.nextInt();
        char2.setStr(str);

        //Choix de l'agilité du joueur 1
        System.out.println("Agilité du personnage ?");
        dex = sc.nextInt();
        char2.setDex(dex);

        //Choix de l'intelligence du joueur 1
        System.out.println("Intelligence du personnage");
        intell = sc.nextInt();
        char2.setIntell(intell);

        //Affichage des caractéristique du joueur 1
        System.out.println("............ je suis le " +char2.getTypes()+" " +char2.getLevel()+" je possède "+char2.getHp()+" de vitalité, " +char2.getStr()+ " d'agilité et " +char2.getIntell()+ " d'intelligence");
        }

}
