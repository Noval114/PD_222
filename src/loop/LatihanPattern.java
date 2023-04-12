package loop;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input;
        System.out.println("jumlah : ");
        input = Integer.parseInt(br.readLine());
        for (int i = 0; i <= input; i++) {
            for (int j = 0; j <= input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //membuat pattern segitiga tanpa inputan
        int segitiga;
        System.out.println("jumlah: ");
         segitiga = Integer.parseInt(br.readLine());
        for (int i = 0; i <= segitiga; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

