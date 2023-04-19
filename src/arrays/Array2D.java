package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] ips = new String[3][4];

        // karena array bertipe String maka ada konversi tipe data ke int bagi data sks, bobot, total, jumlah sks, ip
        // menampung hasil konversi pada variabel
        // 3.5 --> supaya ,5 nya ke hitung maka menggunakan double

        double sks, bobot, totalbobot,total, jumlahSKS, grandtotal=0,ip;

        try{
            // input data nim dan nama

                System.out.print("NIM : ");
                String nim = br.readLine();
                System.out.print("Nama : ");
                String nama = br.readLine();

                // input data MK ( jumlah data MK > 1)
                for (int i = 0; i < ips.length; i++) {
                    System.out.print("Nama MK : ");
                    ips[i][0] = br.readLine();
                    System.out.print("SKS : ");
                    ips[i][1] = br.readLine();
                    // konversi tipe data dari ips [][] (String) ke Double
                    sks = Double.parseDouble(ips [i][1]);
                    System.out.print("Bobot : ");
                    ips [i][2] = br.readLine();
                    bobot = Double.parseDouble(ips[i][2]);

                    // memasukkan perhitungan ips berdasarkan SKS yang nanti di kalikan dengan bobot
                    // rumus total = sks*bobot
                    // grand total = grand total + total
                    totalbobot = sks * bobot;

                    //total bobot per index
                    // konversi dari numerik entah itu (integer, double , dll) ke string itu menggunakan String.valueof
                    ips [i][3] = String.valueOf(totalbobot);
                    System.out.println("total = " + ips [i][3]);

                    //hitung grandtotal
                    grandtotal = grandtotal + totalbobot;
                    System.out.println("--------------------------------");

                    // ketika variabel grandtotal no have been initialized maka masukkan = 0
            }
            System.out.println("Grand Total (SKS * bobot) = " + grandtotal);
                //hitung IP
            System.out.println("jumlah SKS yang diambil :");
            jumlahSKS = Double.parseDouble(br.readLine());
            ip = grandtotal/jumlahSKS;
            System.out.print("IP anda pada semester ini adalah :" + ip);

        }catch (Exception e){

        }
    }
}
