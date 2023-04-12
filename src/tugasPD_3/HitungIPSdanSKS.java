package tugasPD_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HitungIPSdanSKS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bin,diti,log,odm,mat,statistik;
        double na=0,ni=0,nu=0,ne=0,no=0,nn=0;
        double ka,ki,ku,ke,ko,kn;
        double ip;
        double nilaiBobot1,nilaiBobot2,nilaiBobot3,nilaiBobot4,nilaiBobot5,nilaiBobot6;
        double totalBobot,totalSKS;
        System.out.println("------ Menghitung IPS dan Maks SKS Semester 1 ------");
        System.out.println("*Gunakan nilai A, B+, B, C+, C, D, E ketika memasukkan nilai");

        System.out.print("Masukkan nilai Bahasa Indonesia: ");
        bin = br.readLine();
        if (bin.equalsIgnoreCase("A")){
            na = 4;
        } else if (bin.equalsIgnoreCase("B+")){
            na = 3.5;
        } else if (bin.equalsIgnoreCase("B")){
            na = 3;
        } else if (bin.equalsIgnoreCase("C+")){
            na = 2.5;
        } else if (bin.equalsIgnoreCase("C")){
            na = 2;
        } else if (bin.equalsIgnoreCase("D")){
            na = 1;
        } else if (bin.equalsIgnoreCase("E")){
            na = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        ka = Double.parseDouble(br.readLine());
        nilaiBobot1 = na*ka;
        System.out.println("NOTED");

        System.out.print("Masukkan nilai DITI: ");
        diti = br.readLine();
        if (diti.equalsIgnoreCase("A")){
            ni = 4;
        } else if (diti.equalsIgnoreCase("B+")){
            ni = 3.5;
        } else if (diti.equalsIgnoreCase("B")){
            ni = 3;
        } else if (diti.equalsIgnoreCase("C+")){
            ni = 2.5;
        } else if (diti.equalsIgnoreCase("C")){
            ni = 2;
        } else if (diti.equalsIgnoreCase("D")){
         } else if (diti.equalsIgnoreCase("E")){
            ni = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        ki = Double.parseDouble(br.readLine());
        nilaiBobot2 = ni*ki;
        System.out.println("NOTED");

        System.out.print("Masukkan nilai Logaritma Pemrograman: ");
        log = br.readLine();
        if (log.equalsIgnoreCase("A")){
            nu = 4;
        } else if (log.equalsIgnoreCase("B+")){
            nu = 3.5;
        } else if (log.equalsIgnoreCase("B")){
            nu = 3;
        } else if (log.equalsIgnoreCase("C+")){
            nu = 2.5;
        } else if (log.equalsIgnoreCase("C")){
            nu = 2;
        } else if (log.equalsIgnoreCase("D")){
            nu = 1;
        } else if (log.equalsIgnoreCase("E")){
            nu = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        ku = Double.parseDouble(br.readLine());
        nilaiBobot3 = nu*ku;
        System.out.println("NOTED");

        System.out.print("Masukkan nilai Organisasi dan Manajemen: ");
        odm = br.readLine();
        if (odm.equalsIgnoreCase("A")){
            ne = 4;
        } else if (odm.equalsIgnoreCase("B+")){
            ne = 3.5;
        } else if (odm.equalsIgnoreCase("B")){
            ne = 3;
        } else if (odm.equalsIgnoreCase("C+")){
            ne = 2.5;
        } else if (odm.equalsIgnoreCase("C")){
            ne = 2;
        } else if (odm.equalsIgnoreCase("D")){
            ne = 1;
        } else if (odm.equalsIgnoreCase("E")){
            ne = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        ke = Double.parseDouble(br.readLine());
        nilaiBobot4 = ne*ke;
        System.out.println("NOTED");

        System.out.print("Masukkan nilai Matematika Dasar: ");
        mat = br.readLine();
        if (mat.equalsIgnoreCase("A")){
            no = 4;
        } else if (mat.equalsIgnoreCase("B+")){
            no = 3.5;
        } else if (mat.equalsIgnoreCase("B")){
            no = 3;
        } else if (mat.equalsIgnoreCase("C+")){
            no = 2.5;
        } else if (mat.equalsIgnoreCase("C")){
            no = 2;
        } else if (mat.equalsIgnoreCase("D")){
            no = 1;
        } else if (mat.equalsIgnoreCase("E")){
            no = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        ko = Double.parseDouble(br.readLine());
        nilaiBobot5 = no*ko;
        System.out.println("NOTED");

        System.out.print("Masukkan nilai Statistik dan Probabilitas: ");
        statistik = br.readLine();
        if (statistik.equalsIgnoreCase("A")){
            nn = 4;
        } else if (statistik.equalsIgnoreCase("B+")){
            nn = 3.5;
        } else if (statistik.equalsIgnoreCase("B")){
            nn = 3;
        } else if (statistik.equalsIgnoreCase("C+")){
            nn = 2.5;
        } else if (statistik.equalsIgnoreCase("C")){
            nn = 2;
        } else if (statistik.equalsIgnoreCase("D")){
            nn = 1;
        } else if (statistik.equalsIgnoreCase("E")){
            nn = 0;
        } else {
            System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
            System.exit(404);
        }
        System.out.print("Masukkan SKS Mata Kuliah: ");
        kn = Double.parseDouble(br.readLine());
        nilaiBobot6 = nn*kn;
        System.out.println("NOTED");

        totalBobot = nilaiBobot1+nilaiBobot2+nilaiBobot3+nilaiBobot4+nilaiBobot5+nilaiBobot6;
        totalSKS = ka+ki+ku+ke+ko+kn;
        ip = totalBobot/totalSKS;
        System.out.println("IPS anda adalah: " + ip);

        if (ip>=3.50){
            System.out.println("SKS Maks yang dapat anda ambil adalah: 24");
        } else if (ip>=3.00 && ip<3.49){
            System.out.println("SKS Maks yang dapat anda ambil adalah: 22");
        } else if (ip>=2.00 && ip<2.99){
            System.out.println("SKS Maks yang dapat anda ambil adalah: 20");
        } else if (ip<2.00){
            System.out.println("SKS Maks yang dapat anda ambil adalah: 18");
        }
    }
}
