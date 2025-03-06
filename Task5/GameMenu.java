import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

    private ArrayList<String> actions;

    // Standardkonstruktør
    public GameMenu() {
        this.actions = new ArrayList<>();
    }

    // Konstruktør med parameter
    public GameMenu(ArrayList<String> actions) {
        this.actions = new ArrayList<>(actions); // Kopierer listen for at beskytte data
    }

    //Getter
    public ArrayList<String> getActions() {
        return new ArrayList<>(actions);
    }

    public void displayMenu() {

        for(String e: actions) {

            System.out.println(e);
        }
    }

    public int getAction() {

        Scanner scanner = new Scanner(System.in);
        displayMenu();
        System.out.print("Type a number to choose an action: ");

        int value = scanner.nextInt();
        return value;
    }
}
