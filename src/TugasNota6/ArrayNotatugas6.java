package TugasNota6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNotatugas6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] dataBarang = new String[5][4];

        // Mengisi data barang kedalam nota
        dataBarang[0][0] = "sabun";
        dataBarang[0][1] = "5";
        dataBarang[0][2] = "3000";
        dataBarang[1][0] = "indomie goreng";
        dataBarang[1][1] = "3";
        dataBarang[1][2] = "2500";
        dataBarang[2][0] = "le minerale";
        dataBarang[2][1] = "1";
        dataBarang[2][2] = "3000";
        dataBarang[3][0] = "silverqueen";
        dataBarang[3][1] = "3";
        dataBarang[3][2] = "14000";
        dataBarang[4][0] = "sunsilk 400ml";
        dataBarang[4][1] = "1";
        dataBarang[4][2] = "20000";

        // mendeklarasi variabel jumlah dan total
        int jumlah = 0;
        int total = 0;

        System.out.println("=====================================================");
        System.out.printf("%-25s %-10s %-10s %-10s\n", "nama barang", "jumlah", "harga", "total");
        System.out.println("=====================================================");

        // Menampilkan data barang
        for (int i = 0; i < dataBarang.length; i++) {
            // Menghitung total harga untuk setiap barang
            total = Integer.parseInt(dataBarang[i][1]) * Integer.parseInt(dataBarang[i][2]);

            // Menampilkan data barang dan total harga ke dalam tabel
            System.out.printf("%-25s %-10s %-10s %-10s\n", dataBarang[i][0], dataBarang[i][1], dataBarang[i][2], total);

            // Menambahkan total harga ke dalam variabel jumlah
            jumlah += total;
        }

        // Menampilkan grand total dan input uang dibayarkan
        System.out.println("=====================================================");
        System.out.printf("grand total", "%-25s %-10s\n", jumlah);
        System.out.print("uang dibayarkan: ");
        int uangDibayarkan = Integer.parseInt(br.readLine());

        // hitung uang kembalian
        int kembali = uangDibayarkan - jumlah;

        // Menampilkan kembalian
        System.out.print("kembalian " + kembali);
    }
}


