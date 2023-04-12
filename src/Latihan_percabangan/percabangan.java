package Latihan_percabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //if-else
        //cek syarat pembuatan KTP
        int usia;
        System.out.print("Masukan Usia Anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Sudah Memenuhi Syarat");
        } else {
            System.out.println("Usia anda belom memenuhi persyaratan");
        }
        //if-else-if
        //cek status kelulusan MK
        String nim;
        int nilaiUas;
        System.out.print("Masukan Nim Anda : ");
        nim = br.readLine();
        System.out.print("masukan nilai anda : ");
        nilaiUas = Integer.parseInt(br.readLine());

        //jika nilai 80,70,65 = lulus, di bawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100051") && nilaiUas == 80) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("224101000451") && nilaiUas == 65) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100051") && nilaiUas <= 65) {
            System.out.println("TIDAK LULUS");
        } else
            System.out.println("Nilai anda tidak memenuhi");

        //nested if
        //cek menu yang dipilih (makanan/minuman)
        //Makanan = snack, nasi bungkus
        //Minuman = teh, kopi, air, nutrisari

        String menu, jenis;
        System.out.print("masukkan menu (makanan/minuman): ");
        menu = br.readLine();
        System.out.println("masukkan jenis menu \n makanan: snack, nasi bungkus \n Minuman: teh, kopi, air, nutrisari. pilih: ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("harga: Rp 2.000,00");
            } else if (jenis.equalsIgnoreCase("nasi bungkus")) {
                System.out.println("Harga: Rp 7.000,00");
            }
        } else if (menu.equalsIgnoreCase("minuman")) {
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("harga : RP 3.000,00");
            } else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("harga : Rp 4.000,00");
            } else if (jenis.equalsIgnoreCase("air")) {
                System.out.println("harga : Rp 2.000,00");
            } else if (jenis.equalsIgnoreCase("nutrisari")) {
                System.out.println("harga : Rp 5.000,00");
            }
        }
    }
}