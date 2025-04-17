package SimpleColumnarTransposition;

import java.util.Scanner;
import java.util.*;

public class Enkriptimi {
    public static String encrypt(String text, int key) {
        int length = text.length();
        int rows = (int) Math.ceil((double) length / key);
        char[][] matrix = new char[rows][key];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < key; j++) {
                if (k < length)
                    matrix[i][j] = text.charAt(k++);
                else
                    matrix[i][j] = 'X';
            }
        }

        StringBuilder encrypted = new StringBuilder();
        for (int j = 0; j < key; j++) {
            for (int i = 0; i < rows; i++) {
                encrypted.append(matrix[i][j]);
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj tekstin për enkriptim: ");
        String text = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();

        System.out.print("Shkruaj çelësin numerik: ");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Teksti i enkriptuar: " + encryptedText);
    }
}
