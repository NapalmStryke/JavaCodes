import java.util.Scanner;

class Objects {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Scanner
        Objects obj = new Objects();
        Scanner sc = new Scanner(System.in);

        // setting the name object
        System.out.print("Enter your name: ");
        String user_name = sc.next();
        obj.setName(user_name);
        System.out.println("Hello Mr. " + obj.getName() + "!");

        // setting the age object
        System.out.print("Enter your age: ");
        int user_age = sc.nextInt();
        obj.setAge(user_age);
        System.out.println("You are " + obj.getAge() + " years old.");

        sc.close();
    }
}