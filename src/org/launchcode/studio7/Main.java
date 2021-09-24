package org.launchcode.studio7;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        DVD TheBeeMovie = new DVD("Bee Movie", TheEntireBeeMovieScript.line, 4500, 20000000, 1);
        CD myCD = new CD("", "", 200, 500, 1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the cd\n>");
        String cdName = input.nextLine();
        System.out.print("Enter some lyrics, yo.  Be creative.\nP.S. only press enter when done.\n>");
        String cdLyrics = input.nextLine();

        myCD.changeName(cdName);
        myCD.write(cdLyrics);

        int choice = 1;
        while (true) {
            System.out.print("------------------------------------------\nWhat would you like to do now?\n0. Quit\n1. print about for DVD\n2. print contents for dvd\n3. print about for cd\n4. print contents for dvd\n>");
            try {
                choice = input.nextInt();

                System.out.print("------------------------------------------\n");
                switch (choice) {
                    case 0:
                        System.out.print("See ya later!\n");
                        return;
                    case 1:
                        System.out.print(TheBeeMovie.about() + "\n");
                        break;
                    case 2:
                        System.out.print(TheBeeMovie.read() + "\n");
                        break;
                    case 3:
                        System.out.print(myCD.about() + "\n");
                        break;
                    case 4:
                        System.out.print(myCD.read() + "\n");
                        break;
                    default:
                        System.out.print("Yo that's not an option, not cool.");

                }
            } catch (Exception e) {
                System.out.print("not cool yo.  You tryin' to break my shizzle.\n");
                break;
            }
        }
    }
}
