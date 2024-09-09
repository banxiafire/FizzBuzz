/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        doFizzBuzz();

//
//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
    }

    private static void doFizzBuzz() {
        int i = 1;
        while (i <= 100){
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            if (isBuzz && isFizz){
                System.out.println("Fizz Buzz");

            } else if(isBuzz) {
                System.out.println("Buzz");
            } else if (isFizz) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
