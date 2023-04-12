package WhileDowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanwhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while
        //menjumlahkan setiap angka yang di entrikan
        //kondisi: pengurangan dan penjumlahan akan dilakukan apabila angka yang diinputkan >= 0
        // output: angka hasil jumlah

        //int number = 0, jumlah = 0;
        //while (number >= 0) {
           // jumlah += number; // untuk penjumlahan setiap angka yang diinputkan

           // System.out.print("entri angka : ");
           // number = Integer.parseInt(br.readLine());
       // }
       // System.out.println("jumlah = " + jumlah);

        //mengentrikan nim dan nama apabila kondisinya tre ( dua data diisi dengan benar, dimana tipe datanya sesuai)

        boolean b;
        int i = 0;
        while (i<5) {
            System.out.print("entri nim : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("entri nama : ");
            String nama = br.readLine();
            i++;
        }
    }
}