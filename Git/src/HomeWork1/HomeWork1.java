package HomeWork1;

public class HomeWork1 {

    public static void main(String[] args) { // задание 1


        String Orange = "Orange";            //задание 2
        String Banana = "Banana";
        String Apple =  "Apple";

        printThreeWords(Orange,Banana,Apple);//*********************

        int a = 11;                          //задание 3
        int b = 22;
        int valueC = a + b;
        checkSumSign(a,b);
        if (valueC > 0) {
            System.out.println("Sum is correct");
        } else {
            System.out.println("Sum is incorrect");
        }
        System.out.println("**************************");
                                             //задание 4
        int valueD;
        valueD = -10;
        printColor(valueD);

        if (valueD < 0) {System.out.println("Red");}
        else if (valueD==1 || valueD==99) {System.out.println("Yellow");}
        else if (valueD > 100) {System.out.println("Green");}
        System.out.println("**************************");

                                              //задание 5
        int a1 = 19;
        int b1 = 82;
        compareNumbers(a1,b1);
        if (a1 > b1 | a1 == b1) {
            System.out.println("a1 >=b1");
        } else System.out.println("a1 < b1");

    }
     //задание 2
     public static void printThreeWords(String Orange, String Banana, String Apple) {
          System.out.println("Orange\nBanana\nApple");
          System.out.println("***************************");
     }
     //задание 3
     public static void checkSumSign(int valueA, int valueB) {
                System.out.println("Result = " + (valueA + valueB));
    }

    //задание 4
    public static void printColor(int Value) {}

    //задание 5
    public static void compareNumbers(int valueA1, int valueB1) {}

}




