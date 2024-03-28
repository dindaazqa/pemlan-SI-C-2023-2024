package game;

import java.util.Scanner;

public class HeroMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n=== Selamat Datang di Pertarungan Hero ===");

        System.out.println("\nPlayer 1: Masukkan Detail Hero Anda");
        System.out.println("----------------------------------------");
        System.out.print("Nama: ");
        String name1 = input.nextLine();

        System.out.print("Health Point : ");
        double health1 = input.nextDouble();

        System.out.print("Attack : ");
        double attack1 = input.nextDouble();

        System.out.print("Defense : ");
        double defense1 = input.nextDouble();
        System.out.println("----------------------------------------");

        System.out.println("\nPlayer 2: Masukkan Detail Hero Anda");
        System.out.println("----------------------------------------");
        input.nextLine(); 
        
        System.out.print("Nama: ");
        String name2 = input.nextLine();

        System.out.print("Health Point : ");
        double health2 = input.nextDouble();

        System.out.print("Attack : ");
        double attack2 = input.nextDouble();

        System.out.print("Defense : ");
        double defense2 = input.nextDouble();
        System.out.println("----------------------------------------");

        Hero hero1 = new Hero(name1, health1, attack1, defense1);
        Hero hero2 = new Hero(name2, health2, attack2, defense2);

        System.out.println("\n========== Pertarungan Dimulai! ==========");

        System.out.println("\nRonde 1");
        hero1.attack(hero2);

        System.out.println("\nRonde 2");
        hero2.attack(hero1);

        System.out.println("\nRonde 3");
        hero1.attack(hero2);

        System.out.println("\n========== Pertarungan Selesai! ==========\n");
        System.out.println("Hasil Akhir: " + hero1.getName() + " vs " + hero2.getName());
        if (hero1.getHealthPoint() <= 0) {
            System.out.println(hero2.getName() + " Menang!");
        } else if (hero2.getHealthPoint() <= 0) {
            System.out.println(hero1.getName() + " Menang!");
        } else {
            System.out.println("Kedua Hero Masih Bertahan dengan Health Point!");
        }

        input.close();
    }
}
