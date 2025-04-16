package HillCipher;

import java.util.Scanner;

public class Dekriptimi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the text to decrypt (only letters): ");
        String text = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");


        int[][] keyMatrix = new int[2][2];
        System.out.println("Enter 4 numbers for the 2x2 key matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                keyMatrix[i][j] = scanner.nextInt();
            }
        }


        int[][] inverseKeyMatrix = findInverse(keyMatrix);


        String decrypted = decrypt(text, inverseKeyMatrix);
        System.out.println("Decrypted text: " + decrypted);

        scanner.close();
    }

    public static int[][] findInverse(int[][] key) {
        int determinant = (key[0][0] * key[1][1] - key[0][1] * key[1][0]) % 26;
        if (determinant < 0) determinant += 26;


        int inverseDeterminant = modInverse(determinant, 26);


        int[][] inverse = new int[2][2];
        inverse[0][0] = (key[1][1] * inverseDeterminant) % 26;
        inverse[0][1] = (-key[0][1] * inverseDeterminant) % 26;
        inverse[1][0] = (-key[1][0] * inverseDeterminant) % 26;
        inverse[1][1] = (key[0][0] * inverseDeterminant) % 26;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (inverse[i][j] < 0) inverse[i][j] += 26;
            }
        }

        return inverse;
    }


    public static int modInverse(int a, int m) {
        for (int i = 1; i < m; i++) {
            if ((a * i) % m == 1) return i;
        }
        return 1;
    }


    public static String decrypt(String text, int[][] key) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < text.length(); i += 2) {
            int[] vector = {
                    text.charAt(i) - 'A',
                    text.charAt(i + 1) - 'A'
            };


            int[] decrypted = new int[2];
            for (int row = 0; row < 2; row++) {
                decrypted[row] = (key[row][0] * vector[0] + key[row][1] * vector[1]) % 26;
                if (decrypted[row] < 0) decrypted[row] += 26;
            }

            result.append((char) (decrypted[0] + 'A'));
            result.append((char) (decrypted[1] + 'A'));
        }
        return result.toString();
    }
}
