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


public class Musuh extends Karakter implements AksiKarakter{
    private int score;

    public Musuh(String nama,int damage,int defense) {
        super(nama,damage,defense);
    }

    @Override
    public void serang(Karakter target) 
    {
        target.setHp(target.getHp() - (Musuh.this.getDamage() - target.getDefense()));
        System.out.println(Musuh.this.getNama() + " Menyerang " + target.getNama() + 
                "[SISA HP " + target.getNama() + " : " + target.getHp() + "]");
        if (target.getHp() < 0 || target.getHp() == 0) {
            System.out.println(target.getNama() + " mati");
            setDead(true);
        }
    }

    @Override
    public void tampilkanInformasi() 
    {
        System.out.println("=== Statistik " + Musuh.this.getNama() + " ===");
        System.out.println("Nama : " + this.getNama() + "\nSisa HP : " + this.getHp());
        if (!isDead()){
            System.out.println("[Musuh Mati]");
            setDead(false);
        }
    }
}