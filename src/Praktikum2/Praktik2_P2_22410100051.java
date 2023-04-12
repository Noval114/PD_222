package Praktikum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktik2_P2_22410100051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j, b, sb, mb, smb, m, sm;

        System.out.println("masukkan jumlah penumpang :");

        j = Integer.parseInt(br.readLine());

        b=j/50;
        sb = j%50;

        mb = sb/15;
        smb = sb%15;

        m= smb / 7;
        sm = smb / 7;

        System.out.println("jumlah Armada yang dinaiki: ");
        System.out.println("bus : " + sb);
        System.out.println("minibus :" + smb);
        System.out.println("mobil :" + sb);

    }
}
