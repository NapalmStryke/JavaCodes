public class CountUp {
    public static int countFor(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
            System.out.print(i + "  ");
        }
        return sum;
    }

    public static int countWhile(int n) {
        int total = 0;
        int i = 0;
        while (i < n) {
            System.out.print(i + "  ");
            total = total + i;
            i++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("\nWhile Sum: " + countWhile(10));
        System.out.println("----------------------------------");
        System.out.println("\nFor Sum: " + countFor(10));
        System.out.println("----------------------------------");
    }
}