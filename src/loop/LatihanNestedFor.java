package loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LatihanNestedFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //variabel
        int minggu,hari;

        //input
        System.out.println("jumlah minggu : " );
        minggu = Integer.parseInt(br.readLine());
        System.out.println("jumlah hari : ");
        hari = Integer.parseInt(br.readLine());

        //perulangan + output
        //outer loop : baris
        for (int i = 1; i <= minggu ; i++) {
            System.out.println("\n minggu ke - " + i);


            //inner loop : kolom
            for (int j = 1; j <= hari ; j++) {
                //jika tidak ada hari yang ditampilkan pada minggu ke - 4
                if (i==5){
                    break;
                }
                System.out.println("hari : " + j);


            }

        }

        //pattern
        //baris 4

 //       for (int i = 0; i < 4 ; i++) {

            //kolom 4
 //           for (int j = 0; j < 4 ; j++) {
 //               System.out.print("*");
 //         }
 //           System.out.println();
 //       }
        //membuat pattern menggunakan inputan

        int input;
        System.out.println("jumlah : ");
        input = Integer.parseInt(br.readLine());
        for (int i = 0; i <input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        //membuat pattern segitiga tanpa inputan
        //outer loop : baris
        for (int i = 0; i <= 5; i++) {

            //inner loop ; kolom
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

            }
        }




