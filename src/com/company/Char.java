package com.company;

public class Char {

    private int level;
    private int hp;
    private int str;
    private int dex;
    private int intell;
    private int types;
    private String typesName;

    public Char(int level, int hp, int str, int dex, int intell, int types) {
        this.level = level;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.intell = intell;
        this.types = types;
    }

    public int getLevel() {
        return level;
    }

    //En attendant de catcher l'exception, si level plus petit que 1, level = 1 et si plus grand que 100, level = 100
    public void setLevel(int level) {
        if (level < 1 )
            this.level = 1;
        else if (level > 100)
            this.level = 100;
        else
            this.level = level;
    }

    //Les points de vie sont égales au level du joueur multiplié par 5
    public int getHp() {
        hp = level*5;
        return hp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getIntell() {
        return intell;
    }

    public void setIntell(int intell) {
        this.intell = intell;
    }
    //Pour avoir le nom de la classe en fonction du int types ...
    public int getTypes() {
        switch (types){
            case 1:
                typesName = ("Guerrier");
                break;
            case 2:
                typesName = ("Rôdeur");
                break;
            case 3:
                typesName = ("Mage");
                break;
            default:
                typesName = ("null");
                break;
        }
        return types;
    }

    public void setTypes(int types) {
        this.types = types;
    }
}
