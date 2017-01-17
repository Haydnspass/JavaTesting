/**
 * Created by Lucas on 11/01/2017.
 */
package ch01.sec06;
import java.util.Random;

public class FormatOut {
    public static void main(String[] args) {
        Random generator = new Random();
        int next = 0; // generator.nextInt(10); // integer between 0 and 9
        int sum = 0;
        int target = 255;
        int count = 0;
        while (sum < target) {
            next = generator.nextInt(10);
            sum += next;
            count++;
        }
        System.out.println("Number of loops: " + count);
    }
}
