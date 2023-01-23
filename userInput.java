import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String name = sc.next();
        System.out.println("Hello " + name);
        sc.close();
    }
}
