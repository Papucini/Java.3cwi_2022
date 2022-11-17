package burtscher;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Caesar {
    private static int verschiebung;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie einen Wort ein");

        String word = scanner.nextLine();

        System.out.println("Um wie viele Stellen soll verschoben werden? (1-10)");

        int encrypt = scanner.nextInt();


        if (encrypt >= 1 && encrypt <= 10) {

            char[] newword = word.toCharArray();
            char[] secret = encryptword(encrypt, newword);

            System.out.println("Hier das verschlüsselte Wort");

            for (int i = 0; i < secret.length; i++) {

                System.out.print(secret[i]);
            }
            System.out.println("\n");
            System.out.println("Wollen sie das Wort wieder entschlüsseln?");
            System.out.println("geben sie dazu die 1 ein, mit der 2 beenden sie dieses Programm.");


            int selectscan = scanner.nextInt();

            if (selectscan == 1) {
                char[] decryptWord = decryptword(encrypt, secret);
                System.out.println("Das verschlüsselte Wort war: ");
                for (int i = 0; i < decryptWord.length; i++) {
                    System.out.print(decryptWord[i]);
                }
            }else{
                System.out.print("Ok, das Programm wird beendet.");
            }


        } else System.out.println("Die Verschiebung darf nur zwischen 1 und 10 sein");

    }
    @Contract(pure = true)
    public static char @NotNull [] encryptword (int offset, char @NotNull [] charArray){

        char[] encryptArray = new char[charArray.length];


        for (int i = 0; i < charArray.length; i++) {

            int verschiebung = (charArray[i] + offset);

            encryptArray[i] = (char) (verschiebung);

        }
        return encryptArray;

    }
    @Contract(pure = true)
    public static char @NotNull [] decryptword (int offset, char @NotNull [] charArray){

        char[] decryptArray = new char[charArray.length];


        for (int i = 0; i < charArray.length; i++) {

            int verschiebung = (charArray[i] - offset);

            decryptArray[i] = (char) (verschiebung);

        }
        return decryptArray;

    }
}