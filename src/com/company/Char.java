package com.company;

public class Char {

    private int level;
    private int hp;
    private int str;
    private int dex;
    private int intell;
    private int types;

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

    public void setLevel(int level) {
        this.level = level;
    }

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

    public int getTypes() {
        return types;
    }

    public void setTypes(int types) {
        this.types = types;
    }
}
