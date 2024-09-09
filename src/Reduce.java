public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i != 0){
            boolean dev2 = i % 2 == 0;
            if (dev2){
                i = i /2;
            } else {
                i = i - 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
