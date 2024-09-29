package Tugas2;

import java.util.Scanner;

public class Tugas2 {
    public static double luasPersegi(double sisi){
        return sisi * sisi;
    }

    public static double kelilingPersegi(double sisi){
        return 4 * sisi;
    }

    public static double luasPersegiPanjang(double panjang, double lebar){
        return panjang * lebar;
    }

    public static double luasLingkaran(double jariJari){
        return Math.PI * jariJari * jariJari;
    }

    public static double kelilingPersegiPanjang(double panjang, double jariJari){
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.println("Masukan pilihan Anda :");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("Masukan sisi persegi:");
                double sisi = input.nextDouble();
                System.out.println("Luas persegi: " + luasPersegi(sisi));
                System.out.println("Keliling persegi:");
                kelilingPersegi(sisi);
                break;

            case 2:
                System.out.println("Masukan Panjang: ");
                double panjang = input.nextDouble();
                System.out.println("Masukan lebar:");
                double lebar = input.nextDouble();
                System.out.println("Luas persegi panjang:" + luasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang(panjang, lebar));
            break;

            case 3:
                System.out.println("Masukan jari-jari lingkaran:" );
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran: " + luasLingkaran(jariJari));
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        input.close();
    }
}
