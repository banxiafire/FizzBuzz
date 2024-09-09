public class Multiple {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 100){
            boolean ism3 = i % 3 == 0;
            boolean ism5 = i % 5 == 0;

            if (ism3 || ism5){
                count++;
            } i++;
        };
        System.out.println(count);
    }
}
