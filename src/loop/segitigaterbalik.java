package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class segitigaterbalik {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pola segitiga terbalik \n");

        int input;

        System.out.print("Inputkan batas nilainya : ");
        input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            for (int j = 1; j <=input - i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}






