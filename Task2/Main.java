import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please type your name: ");
        Scanner scanner = new Scanner(System.in);
       
        String input = scanner.nextLine();
       
        System.out.println("Hello " + input);
        System.out.print("Please type your age: ");

        int age = scanner.nextInt();

        System.out.println("You are: " + age + " years old");

        int retirementAge = 64 - age;
        
        System.out.println("You have: " + retirementAge + " years until retirement");
 
        scanner.close();
    }
}