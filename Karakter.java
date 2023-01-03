/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Fiis_Laptop
 */

public class Karakter {
    private String nama;
    private int hp = 100;
    private int damage;
    private int defense;
    private boolean isDead = false;

    public Karakter(String nama, int damage, int defense) {
        this.nama = nama;
        this.damage = damage;
        this.defense = defense;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void serang(Karakter target) {

    }

    public void tampilkanInformasi() {

    }
}


