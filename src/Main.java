public class Main {


    private static void multiplesOfThree() {
        // If we list all the natural numbers below 10
        // that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        // The sum of these multiples is 23.

        // Find the sum of all the multiples of or below 1000

        int num = 1000;

        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0|| i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Result for num: " + num);
        System.out.println(sum);

    }
    public static void main(String[] args) {
    
        Main.multiplesOfThree();

        System.out.println("hello test");
        System.out.println(
                " Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World  Hello World ");
    }
}