package Day11;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = "";

        while (!line.equals("quit")) {
            System.out.println("Write a string 1:");
            line = scan.nextLine();
        }

        while (line.length() >= 10) { // "quit".length() = 4 => 4>=10
            System.out.println("Write a string 2");
            line = scan.nextLine();

            System.out.println("string is too large");
        }

        while (line.equals("Max")) { // "quit"== "Max" => false
            System.out.println("Write a string");
            line = scan.nextLine();

            System.out.println("Adams");

        }
    }
}
