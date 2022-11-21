package burtscher;

import java.util.Scanner;

public class StringHelper {
    public static void main(String args[]) {

        Scanner textScanner = new Scanner(System.in);
        System.out.println("- - - Palindrom Checker - - -");
        System.out.println("Geben sie ein Wort ein");

        String Text = textScanner.nextLine();
        String bckwrdsText = "";

        for(int i = Text.length() -1; i>= 0; i--){
            bckwrdsText += Text.charAt(i);
        }

        boolean palindrom = true;
        System.out.println(bckwrdsText);
        for(int i = 0; i < Text.length(); i++){
            if(Text.charAt(i) == bckwrdsText.charAt(i)) {

            } else {
                palindrom = false;
            }
        }

        if(palindrom == true) {
            System.out.println(Text + " ist ein Palindrom!");
        } else {
            System.out.println(Text + " ist leider kein Palindrom");
        }

    }
}