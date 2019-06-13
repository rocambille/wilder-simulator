import java.util.Scanner;

class Console {
    public final static Scanner scanner = new Scanner(System.in);

    public static void printActionList(String[] actions) {
        System.out.println("What you can do:");

        for(String action : actions) {
            System.out.println("* "+action);
        }
    }
    public static String getNextAction() {
        System.out.println("What do you want to do?");

        String action = scanner.nextLine();

        return action;
    }
}