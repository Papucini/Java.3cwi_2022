package burtscher;

import java.util.Random;
import java.util.Scanner;


public class Bankautomat {
    public static void main(String[] args) {

        int total = 0;

        boolean isFinished = false;

        while (!isFinished) {


            System.out.println("Geben sie bitte ihren Namen ein");
            Scanner namescan = new Scanner(System.in);
            String name = namescan.next();

            boolean Ended = false;

            while (!Ended) {
                System.out.println("Hallo " + name + ", was möchten sie machen?");
                System.out.println(" 1 - Einzahlen");
                System.out.println(" 2 - Abheben");
                System.out.println(" 3 - Kontostand");
                System.out.println(" 4 - Beenden");
                Scanner scanner = new Scanner(System.in);

                int selection = scanner.nextInt();
                if (selection == 1) {
                    System.out.println("Wie viel möchten sie Einzahlen?");
                    Scanner scan01 = new Scanner(System.in);
                    Double NewIn = scan01.nextDouble();
                    Double plus = NewIn;
                    System.out.println("Sie haben " + NewIn + "€ eingezahlt.");
                    total += plus;


                } else if (selection == 2) {
                    System.out.println("Wie viel möchten sie Abheben?");
                    Scanner scan02 = new Scanner(System.in);
                    Double NewOut = scan02.nextDouble();

                    var minus = NewOut;

                    System.out.println("Sie haben " + NewOut + "€ abgehoben.");

                    total -= minus;

                } else if (selection == 3) {
                    System.out.println(name + ", dein Kontostand beträgt " + total + " €");


                } else {

                    System.out.println("Ok, der Vorgang wurde Beendet");

                    Ended = true;

                }


            }


        }
    }
}