/**
 * Created by Lucas on 08/01/2017.
 */
package ch01.sec01;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner inputTerminal = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputTerminal.nextLine();
        System.out.println("Your name is: " + name);
    }
}