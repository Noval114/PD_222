package Praktikum3_P2_22410100051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deretkarakter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int angka;
        System.out.print("masukkan deret angka: ");
        angka = Integer.parseInt(br.readLine());
        for (int i = 1; i <= angka ; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            }else {
                System.out.print("#");
            }

        }
    }
}
