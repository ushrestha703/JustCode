import java.util.Scanner;

public class Console {
    public Console(){
    }
    public static void welcomeScreen(){
        System.out.println("Welcome to Stock Watch 6.0");
        System.out.print("What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Welcome " + userName + "\n");
        displayOptions();
    }

    public static void displayOptions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Lookup individual stock");
        System.out.println("2. Lookup stock sector");
        System.out.print("Enter 1 or 2: ");
        Integer userSelection = scanner.nextInt();
    }

}
