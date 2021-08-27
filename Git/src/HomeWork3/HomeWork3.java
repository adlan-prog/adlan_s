package HomeWork3;

import javax.xml.ws.BindingType;
import java.util.Random;

public class HomeWork3 {


    public static Random random = new Random();

    public static void main(String[] args) {


// задание 1
        int[] massive1 = new int[8];
        for (int i = 0; i < massive1.length; i++) {
            System.out.print( " " + randomRange(0, 1));

        }
        System.out.println(" ");

        int[] massive11 = new int[8];
        for (int i = 0; i < massive11.length; i++) {
            System.out.print(" "+ randomRange (0, 1));
        }
        System.out.println("");
        System.out.println("");


// задание 2
        int[] massive2 = new int[100];
        for (int j = 0; j < massive2.length; j++) {
             massive2[j] = j +1;
             System.out.print(" " + j);
        }
        System.out.println("");
        System.out.println("");

// задание 3
        int[] massive3 = new int[12];
        for (int i = 0; i < massive3.length; i++) {
            System.out.print("  " + randomRange(1, 5) * 2);
        }
        System.out.println("");
        System.out.println("");



    }



    //метод случ чисел
    public static int randomRange (int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

}

















