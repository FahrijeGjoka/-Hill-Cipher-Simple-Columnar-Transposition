package HillCipher;

import java.util.Scanner;

public class Enkriptimi {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to encrypt (only letters): ");
        String text = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        if(text.length() % 2 != 0){
            text+='X';
        }
        


        int [][] keyMatrix = new int[2][2];
        System.out.println("Enter 4 numbers for the 2y2 key matrix:");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                keyMatrix[i][j] = scanner.nextInt();
            }
        }

        String encrypted = encrypt(text, keyMatrix);
        System.out.println("Encrypted text: " + encrypted);

        scanner.close();

    }

    public static String encrypt(String text, int [][] key){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<text.length(); i+=2) {
        int [] vector = {
                text.charAt(i) - 'A',
                text.charAt(i+1) - 'A'
        };

        int[] encrypted = new int[2];
        for (int row=0; row<2; row++) {
            encrypted[row] = (key[row][0] * vector[0] + key[row][1] * vector[1]) % 26;
        }

        result.append((char) (encrypted[0] + 'A'));
        result.append((char) (encrypted[1] + 'A'));

        }
        return result.toString();
    }
}
