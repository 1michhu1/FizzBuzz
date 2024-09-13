public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 10; i ++) {
            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if (divisible3 || divisible5) {
                count++;
            };

        }
        System.out.println(count);
    }
}
