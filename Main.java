package main;

/**
 *
 * @author Fiis_Laptop
 */
public class Main {
public static void main(String[] args) {
   Player player = new Player("Letzee", 55, 10);
Musuh monster = new Musuh("Monster", 20, 5);
Musuh bos = new Musuh("Bos", 50, 25);
player.tampilkanInformasi();
System.out.println("\n======= LEVEL 1=======");
player.serang(monster);
monster.serang(player);
monster.serang(player);
player.serang(monster);
System.out.println("======================");
System.out.println("\n======= LEVEL 2=======");
bos.serang(player);
player.serang(bos);
bos.serang(player);
System.out.println("=====================\n");
monster.tampilkanInformasi();
System.out.print("\n");
bos.tampilkanInformasi();
System.out.print("\n");
player.tampilkanInformasi();
System.out.print("\n");
}
}
