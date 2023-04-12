package Latihan_percabangan;

// step 1 import library

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DataMahasiswa {
    public static void main(String[] args) throws IOException {
        //step 3 deklarasi class bufferedreader
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        //step 4 deklarasi variabel
        String nim, nama, prodi;
        int semester, sksDiambil;

        //step 2 error handling = throws IOException
        //contoh error handling try catch
        try {
            //step 5 pengerjaan logika program
            System.out.println("----- Data Mahasiswa -----"); //header

            //input
            System.out.print("NIM :");
            nim = n.readLine();
            System.out.print("Nama :");
            nama = n.readLine();
            System.out.print("prodi :");
            prodi = n.readLine();
            System.out.print("semester :");
            semester = Integer.parseInt(n.readLine());
            System.out.print("sksDiambil :");
            sksDiambil = Integer.parseInt(n.readLine());

            //output
            System.out.println("NIM mahasiswa :" + nim);
            System.out.println("Nama mahasiswa :" + nama);
            System.out.println("Prodi Mahasiswa :" + prodi);
            System.out.println("Semester Mahasiswa:" + semester);
            System.out.println("Jumlah SKS mahasiswa:" + sksDiambil);


        } catch (Exception exp) {
            //kondisi ketika ada erorr, apa yang akan di tampilkan

            System.out.println(exp.getMessage());
        }
    }
}
