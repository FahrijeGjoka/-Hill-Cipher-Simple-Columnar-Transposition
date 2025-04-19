package SimpleColumnarTransposition;

import java.util.Scanner;

public class
Dekriptimi {

    public static String decrypt(String encryptedText, int key) {
        int length = encryptedText.length();
        int rows = (int) Math.ceil((double) length / key);
        char[][] matrix = new char[rows][key];

        int k = 0;

        for (int j = 0; j < key; j++) {
            for (int i = 0; i < rows; i++) {
                if (k < length) {
                    matrix[i][j] = encryptedText.charAt(k++);
                }
            }
        }

        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < key; j++) {
                decrypted.append(matrix[i][j]);
            }
        }

        return decrypted.toString().replaceAll("X+$", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj tekstin e enkriptuar: ");
        String encryptedText = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();

        System.out.print("Shkruaj çelësin numerik (key): ");
        int key = scanner.nextInt();

        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Teksti i dekriptuar: " + decryptedText);
    }
}
