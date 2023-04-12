package WhileDowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanDowhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// letakkan variable sebelum blok try agar semua terbaca dalam blok try-catch
        int nim, i = 0;
        String nama;
        try {
            do {
                System.out.print("entri nim : ");
                nim = Integer.parseInt(br.readLine());
                System.out.print("entri nama : ");
                nama = br.readLine();
                i++;
            } while (i < 5);
        } catch (Exception e) {
        }


        //deklrasi variabel
        String nimMhs = null, namaMhs = "", prodi = "", MK = "", cari = "";
        int uts, uas, tugas, menu, nilaiakhir = 0;
        try {
        /* membuat program dengan menu :
        1. Entri mahasiswa nim,nama,prodi,Mk)
        2. Hitung nilai mahasiswa (UTS,UAS,tugas)
        3. lihat rapor mahasiwa
        4. keluar program
         */
            do {
                System.out.println("===Program Akademi Mahasiswa===");
                System.out.println("1. Entri Mahasiswa");
                System.out.println("2. Hitung nilai MK mahasisawa");
                System.out.println("3. lihat rapor Mahasiswa");
                System.out.println("4. keluar program");
                menu = Integer.parseInt(br.readLine());
                //mengisi logika setiap menu (percabangan: if, switch - case)
                switch (menu) {
                    case 1:
                        System.out.println("=== Menu entri Mahasiswa ===");
                        System.out.print("Entri nim : ");
                        nimMhs = br.readLine();
                        System.out.print("Entri Nama : ");
                        namaMhs = br.readLine();
                        System.out.print("Entri program studi : ");
                        prodi = br.readLine();
                        System.out.print("Entri mata kuliah : ");
                        MK = br.readLine();
                        System.out.println();

                        break; // artinya adalah berhenti di proses case 1 dan mengembalikan ke perulangan pertama
                    case 2:
                        System.out.println("=== Menu Hitung Nilai Mahasiswa ===");
                        // hitung nilai akhir (30% * uts + 30% 8 UAS + 40% * tugas)
                        System.out.println("cari berdasarkan nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            //jika sesuai, entri nilai. jika tidak ada maka pesan "data tidak ditemukan"
                            System.out.print("Entri nilai UTS : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Entri nilai UAS : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Entri nilai tugas : ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiakhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100);

                            //cetak nilaiakhir
                            System.out.println("nilai akhir :" + nilaiakhir);
                            System.out.println();

                        } else {
                            System.out.println("data tidak ditemukan");

                        }

                        break;
                    case 3:
                        System.out.println("=== Menu Lihat rapor ===");
                        System.out.println("cari berdasarkan NIM:");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                            System.out.println(nimMhs + " " + namaMhs);
                            System.out.println("Nilai akhir MK " + MK + ": " + nilaiakhir);
                        /*
                        A= 80-100
                        b+= 75-79
                        b= 65-74
                        c+=60-64
                        c=55-59
                        nilai < 55 == d/e
                         */
                            if (nilaiakhir >= 80 && nilaiakhir <= 100) {
                                System.out.println("nilai akhir : a+");
                            } else if (nilaiakhir >= 75 && nilaiakhir <= 79) {
                                System.out.println("nilai akhir : b+");
                            } else if (nilaiakhir >= 65 && nilaiakhir <= 74) {
                                System.out.println("nilai akhir : b");
                            } else if (nilaiakhir >= 60 && nilaiakhir <= 64) {
                                System.out.println("nilai akhir : c+");
                            } else if (nilaiakhir >= 55 && nilaiakhir <= 59) {
                                System.out.println("nilai akhir : c");
                            } else {
                                System.out.println("nilai akhir d/e");
                                System.out.println();
                            }
                        }else{
                            System.out.println("data tidak ditemukan");
                        }
                        break;
                    case 4:
                        break;
                    default: // jika yang dipilih di luar 1-3, maka menjalankan apa
                        System.out.println("program telah selesai");
                        System.exit(0);
                }
            }

            while (menu != 4); // boleh juga diisi true

        } catch (
                Exception e) {
            System.out.println("terdapat kesalahan -->" + e.getMessage());
        }
    }
}


