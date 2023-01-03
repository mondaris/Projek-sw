
package main;

/**
 *
 * @author Fiis_Laptop
 */


public class Player extends Karakter implements AksiKarakter{
    private int score;

    public Player(String nama, int damage, int defense) {
        super(nama, damage, defense);
    }

    public int getScore() {
        return score;
    }


    @Override
    public void serang(Karakter target) 
    {
        target.setHp(target.getHp() - (Player.this.getDamage() - target.getDefense()));
        System.out.println(Player.this.getNama() + " Menyerang " + target.getNama() + 
                "[SISA HP " + target.getNama() + " : " + target.getHp() + "]");
        if (target.getHp() < 0 || target.getHp() == 0) {
            setDead(true);
            this.score = score + 20;
            System.out.println(target.getNama() + " berhasil dikalahkan");
        }
    }

    @Override
    public void tampilkanInformasi() 
    {
        System.out.println("=== Statistik Player ===");
        System.out.println("Nama : " + this.getNama() + 
                "\nSisa HP : " + this.getHp() + "\nScore : " + score);
        if (isDead()){
            System.out.println("[Player Mati]");
            setDead(false);
        }
    }
}