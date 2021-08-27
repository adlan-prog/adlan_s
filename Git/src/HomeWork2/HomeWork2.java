package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Result 1 = " + method1(6,9)); //1 задание
        System.out.println("*************************");

        method2(15);                                     // 2 задание
        System.out.println("***********************");


        System.out.println("Result 3 = " + method3(30));  //3 задание
        System.out.println("*************************");

        for (int i=10; i<30; i++) {                             //4 задание
            System.out.println("Result 4 = " + i);
        }
        System.out.println("***********************");

        int a=15;
        while ( a<24 ) {
            a++;
            if (a==20) continue;
            if (a==23) break;
            System.out.println("Result 4 >" + a);
        }

    }

    //1 задание
    public static boolean method1 (int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }

    // 2 задание
    public static void method2(int value1) {
        if (value1 >=0)
               {System.out.println("Result 2 = positive");}
        else
               {System.out.println("Result 2 = negative");}
    }

    //3 задание
     public static boolean method3(int value) {
        value= 30;
        return (value >0) || (value < 0);
    }

}











